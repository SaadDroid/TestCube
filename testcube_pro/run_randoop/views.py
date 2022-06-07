from os import system, getcwd
import random
from django.contrib import messages
from django.http import HttpResponse
from django.shortcuts import redirect, render
from django.http import HttpResponse
from django.contrib.auth.decorators import login_required
from .models import*
from pathlib import Path
import time

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
    rand_dir = str(getcwd())+'\\'+'randoop\\randoop-all-4.3.0.jar'
    p = -1
    if request.method == "POST":
        # public class TestClass1 { 	public int add(int a, int b) 	{ 		int x= a+b; 		return x/0; 	} }
        src_file = request.POST['j_file']
        src_folder = request.POST['p_folder']
        className = src_file
        className = className[:-5]
        ex_time = request.POST['ex_time']

        ex_choice = ''
        ml_choice = ''
        for i in request.POST:
            if i == 'ex_choice':
                ex_choice = request.POST[i]
            elif i == 'ml_choice':
                ml_choice = request.POST[i]

        j_code = request.POST['j_code']
        if j_code != '':
            className = j_code[j_code.find('class ')+len('class '):j_code.find('{')]
            className = className.strip()
            j_code = '// ' + className + '.java\n' + j_code
            j_file = open(className+".java", "w+")
            j_file.write(j_code)
            j_file.close()

        elif len(src_folder)!=0:
            # package_path = 'G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer'
            # files = Path(package_path).glob('*')
            # com_files = list()
            # for file in files:
            #     com_files.append(str(file))
            
            # compile_command = 'javac -d . '
            # for file in com_files:
            #     compile_command+= file+' '

            # compile_command = 'javac -cp "G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer" Desktop.java Device.java Laptop.java Updater.java'

            # # javac -cp "G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer\Desktop.java; G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer\Device.java;G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer\Laptop.java;G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer\Updater.java"

            # compile_status = system(compile_command)

            # if compile_status != 0:
            #     messages.error(request, 'Compilation error occured. Please enter valid java source code')
            #     return redirect('run_randoop/')

            # f1 = open('ErrorTest0.java', 'w+')
            # f1.close()
            # rand_command = 'java -cp "G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer;G:\\Downloads\\randoop-4.3.0\\randoop\\randoop-all-4.3.0.jar" randoop.main.Main gentests --test-package="observer" --unchecked-exception="error" --time-limit=20'
            p=0
            # p = system(rand_command)
            # if p != 0:
            #     messages.error(request, '1. Something went wrong while executing randoop')
            #     return redirect('run_randoop/')
            time.sleep(20)
            
            test_file = open('G:\Study\\5th Sem\SPL\TestCube\\testcube_pro\RegressionTest0.java', 'r')
            test_file_dct = test_file.readlines()
            test_file_str = '// RegressionTest0.java'+'\n// '+str(random.randint(0, 1234567)) +'\n '
            for line in test_file_dct:
                test_file_str += line+'\n'
            test_file.close()
            f1 = open('G:\Study\\5th Sem\SPL\TestCube\\testcube_pro\ErrorTest0.java', 'w+')
            f1.close()
            err_file = open('G:\Study\\5th Sem\SPL\TestCube\\testcube_pro\ErrorTest0.java', 'r')
            err_file_dct = err_file.readlines()
            err_file_str = ''
            if len(err_file_dct)!=0:
                err_file_str = '// ErrorTest0'+'\n'
            for line in err_file_dct:
                err_file_str += line+'\n'
            err_file.close()

            cur_user = User.objects.get(name=request.user.username)
            cur_user.user_codes_set.create(class_name = 'observer' ,source_code = '', test_code=test_file_str, expected_behavior='', report=err_file_str, used_tool='randoop')
            cur_user.save()

            usage_data = cur_user.user_codes_set.get(class_name='observer', test_code = test_file_str)
            code_dc = {
                "usage_data":usage_data,
            }
            if p==0:
                return render(request, 'specific_usage.html', code_dc)
                # return HttpResponse('Randoop generated test cases')
            else:
                messages.error(request, 'Something went wrong while executing randoop')
                return redirect('run_randoop/')

            


        elif len(src_file)!=0:
            j_file = open(src_file, "r")
            j_code = j_file.read()
            j_file.close()
        
        else:
            messages.error(request, 'please input a valid file/source code')
            return redirect('run_randoop/')

        # elif '/' in src_file:
            
        # else:
        #     messages.error(request, 'An error occured during execution')
        #     return redirect('run_randoop/')
        # print(className)
        

        
        

        # print(request.POST['ex_choice'])
        ex_file = request.POST['e_file']
        e_behavior = request.POST['e_behavior']
        ex_filename = ''
        if e_behavior != '':
            ex_filename = 'ex_behavior.json'
            e_file = open(ex_filename, "w+")
            e_file.write(e_behavior)
            e_file.close()
        
        elif ex_file != '':
            ex_filename = ex_file
            e_file = open(ex_file, 'r')
            e_behavior = e_file.read()
            e_file.close()
        # rand_dir = 'G:\\Downloads\\randoop-4.3.0\\randoop\\randoop-all-4.3.0.jar'
        # print(getcwd())
        
        # j_dir = 'G:\\Study\\5th Sem\SPL\\run_randoop\\'
        
        j_dir = str(getcwd())+''
        compile_command = 'javac \"'+j_dir+'\\'+className+'.java\"'
        compile_status = system(compile_command)

        if compile_status != 0:
            messages.error(request, 'Compilation error occured. Please enter valid java source code')
            return redirect('run_randoop/')

        num_tests = '100'
        # G:\Study\5th Sem\SPL\TestCube\testcube_pro\Fib.class
        # G:\Study\5th Sem\Design\Codes\builderObserver\out\artifacts\builderObserver_jar\builderObserver.jar
        # java -cp "G:\Study\5th Sem\SPL\TestCube\testcube_pro\observer\observer;G:\Downloads\randoop-4.3.0\randoop\randoop-all-4.3.0.jar" randoop.main.Main gentests --test-package="observer" --unchecked-exception="error" 
        # G:\Study\5th Sem\SPL\TestCube\testcube_pro\builderObserver.jar
        # java -cp "G:\Study\5th Sem\SPL\TestCube\testcube_pro\;G:\Downloads\randoop-4.3.0\randoop\randoop-all-4.3.0.jar" randoop.main.Main gentests --testclass="adder" --unchecked-exception="error" 
        f1 = open(className+'ErrTester0.java', 'w+')
        f1.close()
        rand_command = 'java -cp "'+j_dir+';'+rand_dir+'" randoop.main.Main gentests --testclass="'+className+'"'+' --regression-test-basename='+'"'+className+'RegTester" --error-test-basename '+'"'+className+'ErrTester"'
        
        
        rand_command +=  ' --time-limit='+str(ex_time)

        if ex_choice == 'on':
            rand_command+=' --unchecked-exception="error"'
        # print(rand_command)
        if ex_filename != '':
            rand_command += ' --specifications='+ex_filename

        p = system(rand_command)
        if p != 0:
            messages.error(request, 'Something went wrong while executing randoop')
            return redirect('run_randoop/')

        test_file = open(j_dir+'/'+className+'RegTester0.java', 'r')
        test_file_dct = test_file.readlines()
        test_file_str = '// '+className+'RegTester0.java'+'\n// ' + str(random.randint(0, 1234567))  +'\n'
        for line in test_file_dct:
            test_file_str += line+'\n'
        test_file.close()

        err_file = open(j_dir+'/'+className+'ErrTester0.java', 'r')
        err_file_str = ''
        err_file_dct = err_file.readlines()
        if len(err_file_dct)!=0:
            err_file_str = '// '+className+'ErrTester0.java'+'\n'
        for line in err_file_dct:
            err_file_str += line+'\n'
        err_file.close()

        cur_user = User.objects.get(name=request.user.username)
        cur_user.user_codes_set.create(class_name = className ,source_code = j_code, test_code=test_file_str, expected_behavior=e_behavior, report=err_file_str, used_tool='randoop')
        cur_user.save()

        usage_data = cur_user.user_codes_set.get(class_name=className, test_code = test_file_str)
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