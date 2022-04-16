import json

data_dir = '/home/qoobee/Study/5th Semester/SPL-2/dataset/eval/'
data_file = 'tc_713.json'

input_dir, in_file = 'inputs/', data_file[:-4]+'java'
output_dir, out_file = 'outputs/', in_file
in_file_writer, out_file_writer = open(input_dir+in_file, 'w+'), open(output_dir+out_file, 'w+')

with open(data_dir+data_file, 'r') as json_file:
    json_load = json.load(json_file)

print(json_load['Repository']['url'])
print(json_load['MappedTestCase']['test_class'])
print(json_load['MappedTestCase']['test_case']['body'], file=out_file_writer)
print(json_load['MappedTestCase']['focal_method']['body'], file=in_file_writer)

in_file_writer.close(), out_file_writer.close()