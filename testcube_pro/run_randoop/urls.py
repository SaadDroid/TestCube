from xml.etree.ElementInclude import include
from django.urls import path
from . import views
from django.urls import path

urlpatterns = [
    path('', views.run_rand),
    # path('execute-randoop/', include('run_randoop.urls')),
]
