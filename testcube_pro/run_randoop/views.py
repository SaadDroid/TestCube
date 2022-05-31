from os import system, getcwd
from django.contrib import messages
from django.http import HttpResponse
from django.shortcuts import redirect, render
from django.http import HttpResponse
from django.contrib.auth.decorators import login_required

# Create your views here.
# @login_required
def home(request):
    if request.user.is_authenticated:
        print(request.user.id)
        return render(request, 'randoopInput.html')
    else:
        messages.error(request, 'Please login first')
        return redirect('login')

# @login_required
def run_rand(request):
    if request.method == "POST":
        # public class TestClass1 { 	public int add(int a, int b) 	{ 		int x= a+b; 		return x/0; 	} }
        j_code = request.POST['j_code']
        className = j_code[j_code.find('class ')+len('class '):j_code.find('{')]
        className = className.strip()
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
        system(compile_command)
        num_tests = '100'
        # java -cp "G:\Study\5th Sem\SPL\run_randoop\;G:\Downloads\randoop-4.3.0\randoop\randoop-all-4.3.0.jar" randoop.main.Main gentests --testclass="Adder" --output-limit=100
        rand_command = 'java -cp \"'+j_dir+';'+rand_dir+'\" randoop.main.Main gentests --testclass=\"'+className+'\"'+' --output-limit='+num_tests
        # print(rand_command)
        p = system(rand_command)
    if p==0:
        return HttpResponse('Randoop generated test cases')
    else:
        return HttpResponse('Something went wrong')
