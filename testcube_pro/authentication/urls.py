from xml.etree.ElementInclude import include
from django import views
from django.contrib import admin
from django.urls import path, include
from authentication import views
urlpatterns = [
    path('', views.home, name="home"),
    path('signup', views.signup, name="signup"),
    path('login', views.login, name="login"),
    path('logout', views.logout, name="logout"),
]
