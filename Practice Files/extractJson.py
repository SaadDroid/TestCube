import json

data_dir = '/home/qoobee/Study/5th Semester/SPL-2/dataset/eval/'
data_file = 'tc_50.json'

input_dir, in_file = 'inputs/', 
output_dir = data_dir[:-5]+'outputs/'


with open(data_dir+data_file, 'r') as json_file:
    json_load = json.load(json_file)

print(json_load['MappedTestCase']['test_case']['body'])
print(json_load['MappedTestCase']['focal_method']['body'])