from os import system, getcwd
from django.http import HttpResponse
from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def home(request):
    return render(request, 'randoopInput.html')

def run_rand(request):
    if request.method == "POST":
        # public class TestClass1 { 	public int add(int a, int b) 	{ 		int x= a+b; 		return x/0; 	} }
        j_code = request.POST['j_code']
        className = j_code[j_code.find('class ')+len('class '):j_code.find('{')]
        className = className.strip()
        print(className)
        e_behavior = request.POST['e_behavior']

        j_file = open(className+".java", "w+")
        j_file.write(j_code)
        j_file.close()

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
        rand_command = 'java -cp \"'+j_dir+';'+rand_dir+'\" randoop.main.Main gentests --testclass=\"'+className+'\"'
        p = system(rand_command)
    if p==0:
        return HttpResponse('Randoop generated test cases')
    else:
        return HttpResponse('Something went wrong')
