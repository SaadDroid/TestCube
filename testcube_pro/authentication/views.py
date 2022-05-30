from email import message
from operator import index
from django.http import HttpResponse
from django.shortcuts import redirect, render
from django.http import HttpResponse
from django.contrib.auth.models import User
from django.contrib import messages
from django.contrib.auth import authenticate
from django.contrib.auth import login as _login
from django.contrib.auth import logout as _logout

# Create your views here.
def home(request):
    return render(request, "index.html")

def signup(request):
    if request.method == "POST":
        username = request.POST['username']
        firstname = request.POST['firstname']
        lastname = request.POST['lastname']
        email = request.POST['email']
        pass1 = request.POST['pass1']
        pass2 = request.POST['pass2']

        myuser = User.objects.create_user(username, email, pass1)
        myuser.first_name = firstname
        myuser.last_name = lastname
        myuser.save()
        messages.success(request, "Your Account has been created successfully.")
        return redirect('login')
    return render(request, "signup_1.html")


def login(request):
    if request.user.is_authenticated:
        return redirect('run_randoop/')
    if request.method == "POST":
        username = request.POST['username']
        password = request.POST['pass1']

        user = authenticate(username=username, password=password)

        if user is not None:
            _login(request, user)
            firstname = user.first_name
            return redirect('run_randoop/')
            # return render(request, "index.html", {'firstname': firstname})
        
        else:
            messages.error(request, "Username/Password incorrect")
            return redirect('login')
    return render(request, "login.html")

def logout(request):
    _logout(request)
    messages.error(request, 'Successfully logged out')
    return redirect('login')