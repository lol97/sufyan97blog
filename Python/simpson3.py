'''
    code for :
        simpson 1/3 for seach area from list [[x,y]]
    using :
        python 3.6
    sufyan97
'''
'''
    case for single:
    list = [[3,10],[5,10],[7,9]]
'''
# declare library
import numpy as np

# check consistency
def check_consistency(list_x):
        cond = True
        msg = "x consistent"
        h = list_x[1]-list_x[0]
        for i in range(1,len(list_x)-1):
            if(list_x[i+1]-list_x[i]!=h):
                cond = False
                msg = "in index : "+str(i+1)+" in consistence"
                break
        return cond,msg
    # check variable
    # print(list_x)
    # print(check_consistency(list_x)[0])

# single case
def simpson3_single(list):
    list_x=np.array(list)[:,0]
    list_y=np.array(list)[:,1]

    # handle return value from check_consistency function
    res_1 = check_consistency(list_x)

    # final result
    if(res_1[0]):
        # print(((list_x[1]-list_x[0])/3))
        # print(sum([list_y[0],4*list_y[1],list_y[2]]))
        h = abs(list_x[1]-list_x[0])
        return (h/3)*sum([list_y[0],4*list_y[1],list_y[2]])
    else:
        return (res_1[1])

# # run function for single 
# list = [[3,10],[5,10],[7,9]]
# print(simpson3_single(list))

'''
    case for komposit:
    list = [[3,10],[5,10],[7,8],[9,8],[11,8],[13,5],[15,3]]    
'''

def simpson3_composit(list):
    list_x=np.array(list)[:,0]
    list_y=np.array(list)[:,1]
    
    # handle return value from check_consistency function
    res_1 = check_consistency(list_x)
    if(res_1[0]):
        h = abs(list_x[1]-list_x[0])
        y_ganjil = []
        y_genap = []
        for i in range(1,len(list_y)-1):
            if(i%2==0):
                y_genap.append(list_y[i])
            else:
                y_ganjil.append(list_y[i])
        print(h/3,y_ganjil,y_genap)
        return (h/3)*(sum([list_y[0],4*sum(y_ganjil),2*sum(y_genap),list_y[len(list_y)-1]]))
    else:
        return res_1[1]

list = [[3,10],[5,10],[7,8],[9,8],[11,8],[13,5],[15,3]]
print(simpson3_composit(list))