"""testcube_pro URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import include, path
from run_randoop import views as rr_views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('run_randoop/', rr_views.home),
    path('run_randoop/previous/', rr_views.viewHistory),
    path('run_randoop/previous/<int:id>', rr_views.viewSpecificUsage, name="index"),
    path('execute-randoop', include('run_randoop.urls')),
    path('', include('authentication.urls')),
]
