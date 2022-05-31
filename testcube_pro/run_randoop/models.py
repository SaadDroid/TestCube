from tkinter import CASCADE
from django.db import models


# Create your models here.
class User(models.Model):
    name = models.CharField(max_length=20)

    def __str__(self):
        return self.name

class User_Codes(models.Model):
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    source_code = models.TextField()
    test_code = models.TextField()
    expected_behavior = models.TextField()
    report = models.TextField()
    date_time = models.DateTimeField(auto_now=True)
    used_tool = models.CharField(max_length=10, null=True)

    def __str__(self):
        return self.report
    