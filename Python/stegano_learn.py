from stegano import lsb
secret = lsb.hide("car.png","hai")
secret.save("car-sec.png")

print(lsb.reveal("car-sec.png"))