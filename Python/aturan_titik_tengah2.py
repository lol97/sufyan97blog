'''
    @author : sufyan saori (xsufyan@gmail.com)
    code ini untuk menyelesaikan soal yang ada pada situs : https://aimprof08.wordpress.com/2012/09/09/aturan-titik-tengah-midpoint-rule/
'''
import math

def fungsi_soal(x):
    # ubah fungsi kembalian (return) sesuai dengan keinginan soal
    return 2+math.cos(2*(x**0.5))

def aturan_tengah_2(a,b,partisi):
    h = (b-a)/partisi
    print("didapat nilai h = ",h,"yang berasal dari (",b,"-",a,")/",partisi)
    total = 0
    print("index \t x \t y")
    for n in range(1,partisi+1):
        total += a+fungsi_soal((n-0.5)*h)
        print(n,"\t",(n-0.5)*h,"\t",fungsi_soal((n-0.5)*h))

    print("maka luasnya adalah ",h*total)
    

def main():
    aturan_tengah_2(0,2,8)

if __name__ == "__main__":
    main()