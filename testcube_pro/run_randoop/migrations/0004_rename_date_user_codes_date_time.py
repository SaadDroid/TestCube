# Generated by Django 4.0.4 on 2022-05-31 16:17

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('run_randoop', '0003_user_codes_date'),
    ]

    operations = [
        migrations.RenameField(
            model_name='user_codes',
            old_name='date',
            new_name='date_time',
        ),
    ]
