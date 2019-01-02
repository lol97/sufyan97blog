'''
	code by : Sufyan Saori (xsufyan@gmail.com)
	soal1:
	hitung hasil dari luas nilai x dan y dari tabel berikut dengan xawal=0 dan xakhir=6 dan h=2
	tabel_awal = [[3,10],[5,10],[7,8],[9,8],[11,8],[13,5],[15,3]]
	tabel_tengah = [[4,10],[6,7],[8,8],[10,8],[12,5],[14,3]]
	format list [[x1,y1],...,[xn,yn]]
'''

def hitung_luas_mode_titik_tengah(tabel_nilai,h):
	total_y_half = 0
	for value in tabel_nilai:
		total_y_half+=value[1]
	return h*total_y_half

def main():
	tabel_tengah = [[4,10],[6,7],[8,8],[10,8],[12,5],[14,3]]
	print("nilai luasnya adalah : ",hitung_luas_mode_titik_tengah(tabel_tengah,2))

if __name__ == '__main__':
	main()
