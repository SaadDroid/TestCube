# Generated by Django 4.0.4 on 2022-05-31 15:50

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('run_randoop', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='user',
            old_name='username',
            new_name='name',
        ),
    ]
