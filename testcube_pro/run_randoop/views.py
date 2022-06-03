from os import system, getcwd
from django.contrib import messages
from django.http import HttpResponse
from django.shortcuts import redirect, render
from django.http import HttpResponse
from django.contrib.auth.decorators import login_required
from .models import*

# Create your views here.
# @login_required
def home(request):
    if request.user.is_authenticated:
        # print(request.user.id)
        return render(request, 'randoopInput.html')
    else:
        messages.error(request, 'Please login first')
        return redirect('login')

# @login_required
def run_rand(request):
    p = -1
    if request.method == "POST":
        # public class TestClass1 { 	public int add(int a, int b) 	{ 		int x= a+b; 		return x/0; 	} }
        j_code = request.POST['j_code']
        className = j_code[j_code.find('class ')+len('class '):j_code.find('{')]
        className = className.strip()
        j_code = '// ' + className + '.java\n' + j_code
        # print(className)
        e_behavior = request.POST['e_behavior']

        j_file = open(className+".java", "w+")
        j_file.write(j_code)
        j_file.close()
        ex_choice = ''
        ml_choice = ''
        for i in request.POST:
            if i == 'ex_choice':
                ex_choice = request.POST[i]
            elif i == 'ml_choice':
                ml_choice = request.POST[i]

        # print(request.POST['ex_choice'])
        if e_behavior != None:
            e_file = open("ex_behavior.json", "w+")
            e_file.write(e_behavior)
            e_file.close()
            
        # rand_dir = 'G:\\Downloads\\randoop-4.3.0\\randoop\\randoop-all-4.3.0.jar'
        # print(getcwd())
        rand_dir = str(getcwd())+'\\'+'randoop\\randoop-all-4.3.0.jar'
        # j_dir = 'G:\\Study\\5th Sem\SPL\\run_randoop\\'
        
        j_dir = str(getcwd())+''
        compile_command = 'javac \"'+j_dir+'\\'+className+'.java\"'
        compile_status = system(compile_command)

        if compile_status != 0:
            messages.error(request, 'Compilation error occured. Please enter valid java source code')
            return redirect('run_randoop/')

        num_tests = '100'
        # G:\Study\5th Sem\SPL\TestCube\testcube_pro\Fib.class
        # java -cp "G:\Study\5th Sem\SPL\TestCube\testcube_pro\;G:\Downloads\randoop-4.3.0\randoop\randoop-all-4.3.0.jar" randoop.main.Main gentests --testclass="adder" --unchecked-exception="error" 
        rand_command = 'java -cp "'+j_dir+';'+rand_dir+'" randoop.main.Main gentests --testclass="'+className+'"'+' --regression-test-basename='+'"'+className+'Tester" --time-limit=20 --unchecked-exception="error"'
        # print(rand_command)
        p = system(rand_command)

        test_file = open(j_dir+'/'+className+'Tester0.java', 'r')
        test_file_dct = test_file.readlines()
        test_file_str = '// '+className+'Tester0.java'+'\n'
        for line in test_file_dct:
            test_file_str += line+'\n'
        test_file.close()

        cur_user = User.objects.get(name=request.user.username)
        cur_user.user_codes_set.create(class_name = className ,source_code = j_code, test_code=test_file_str, expected_behavior=e_behavior, report='', used_tool='randoop')
        cur_user.save()

        usage_data = cur_user.user_codes_set.get(class_name=className, source_code = j_code)
        code_dc = {
            "usage_data":usage_data,
        }
        
    if p==0:
        return render(request, 'specific_usage.html', code_dc)
        # return HttpResponse('Randoop generated test cases')
    else:
        messages.error(request, 'Something went wrong while executing randoop')
        return redirect('run_randoop/')


def viewHistory(request):
    cur_user = User.objects.get(name=request.user.username)
    # user_codes = cur_user.user_codes_set.all()
    code_dc = {
        "user_codes": cur_user.user_codes_set.all(),
    }
    return render(request, 'usage.html', code_dc)


def viewSpecificUsage(request, id):
    cur_user = User.objects.get(name=request.user.username)
    usage_data = cur_user.user_codes_set.get(id=id)
    code_dc = {
        "usage_data": cur_user.user_codes_set.get(id=id)
    }
    return render(request, 'specific_usage.html', code_dc)