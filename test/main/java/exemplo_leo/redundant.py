#!/usr/bin/python

import sys

aux = 0
set_mutant_01 = set()
set_mutant_02 = set()


def open_analysis_file(mutant_01, mutant_02):
    with open(mutant_01) as m_01:
        for line in m_01:
            line_list = line[0:-1].split(" ")
            test_name = line_list[0];
            set_mutant_01.add(test_name)
    with open(mutant_02) as m_02:
        for line in m_02:
            line_list = line[0:-1].split(" ")
            test_name = line_list[0];
            set_mutant_02.add(test_name)
    if(len(set_mutant_01) == 0):
        print(mutant_01 + " was not killed.")
    if(len(set_mutant_02) == 0):
        print(mutant_02 + " was not killed.")

    set_only_01 = set_mutant_01.difference(set_mutant_02)
    set_only_02 = set_mutant_02.difference(set_mutant_01)
    set_union_01_02 = set_mutant_02.union(set_mutant_01)

    print("\n #Only in " + mutant_01 + ":" + str(len(set_only_01)))
    print(set_only_01)
    print("\n #Only in " + mutant_02 + ":" + str(len(set_only_02)))
    print(set_only_02)
    print("\n #Union between " + mutant_01 + " and " + mutant_02 + ":" + str(len(set_union_01_02)))
    print(set_union_01_02)

    if(set_mutant_02.issubset(set_mutant_01)):
        print((mutant_02 + " is dominant over " + mutant_01))
    if(set_mutant_01.issubset(set_mutant_02)):
        print((mutant_01 + " is dominant over " + mutant_02))
   

if __name__ == "__main__":
    #print(sys.argv[1])
    open_analysis_file(sys.argv[1], sys.argv[2])
