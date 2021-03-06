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
from authentication import views as auth_view
from downloadFile import views as d_view

urlpatterns = [
    path('admin/', admin.site.urls),
    path('run_randoop/', rr_views.home),
    path('run_randoop/previous/', rr_views.viewHistory),
    path('profile/', auth_view.viewProfile),
    path('run_randoop/previous/<int:id>', rr_views.viewSpecificUsage, name="index"),
    path('execute-randoop', include('run_randoop.urls')),
    path('', include('authentication.urls')),
    path('run_randoop/previous/download/<str:filename>', d_view.download_file, name="index"),
    path('download/<str:filename>', d_view.download_file, name="index"),
    # path('confirm/', auth_view.conf)
]
