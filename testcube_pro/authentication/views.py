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
from django.shortcuts import get_object_or_404
import random
from django.core.mail import send_mail
from django.conf import settings


# Create your views here.
otp = ''
username = ''
pass1 = ''
firstname = ''
lastname = ''
email = ''

def home(request):
    return render(request, "index.html")

def signup(request):
    if request.user.is_authenticated:
        return redirect('run_randoop/')
    if request.method == "POST":
        global username
        global firstname
        global lastname
        global email
        global pass1
        username = request.POST['username']
        try:
            User.objects.get(username=username)
            messages.error(request, 'username already taken')
            return redirect('signup')
        except User.DoesNotExist:
            print('new user')
        firstname = request.POST['firstname']
        lastname = request.POST['lastname']
        email = request.POST['email']
        try:
            User.objects.get(email=email)
            messages.error(request, 'email already taken')
            return redirect('signup')
        except:
            print('')
        pass1 = request.POST['pass1']
        pass2 = request.POST['pass2']
        if pass1 == pass2:
            global otp
            otp = genOTP()
            
            send_mail(
            'Your account confirmation message',
            'Welcome to test cube. Please provide the following OTP to complete your account creation.\nYour OTP is: '+otp+'\nThank you for using TestCube',
            settings.EMAIL_HOST_USER,
            [email],
            fail_silently=False,
            )
            # messages.success(request, "Your Account has been created successfully.")
            return render(request, "otp.html")
        else:
            messages.error(request,'passwords did not match')
    return render(request, "signup_1.html")

def conf(request):
    if request.user.is_authenticated:
        return redirect('run_randoop/')
    if request.method == 'POST':
        usr_otp = request.POST['OTP']
        global otp
        if usr_otp == otp:
            myuser = User.objects.create_user(username, email, pass1)
            myuser.first_name = firstname
            myuser.last_name = lastname
            myuser.save()
            messages.success(request, 'Account created successfully')
            return redirect('login')
        else:
            messages.error(request, 'Account creation failed')
            return redirect('signup')
        
    else:
        messages.error(request, 'Something unexpected happened, please try again')
        return redirect('signup')


def genOTP():
    st = ''
    for x in range(6):
        st += str(random.randint(0,9))
    return st


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
    messages.success(request, 'Successfully logged out')
    return redirect('login')


def viewProfile(request):
    user = get_object_or_404(User, username=request.user.username)
    return render(request, 'userProfile.html', {'profile_user':user})