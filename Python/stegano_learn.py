'''
    Stegano Code
    with
        library stegano
    sufyan97
    install stegano
    pip install stegano
'''
#import lsb method
from stegano import lsb

# insert message
secret = lsb.hide("cat.png","hai")

#save image
secret.save("cat-sec.png")

#show message
print(lsb.reveal("cat-sec.png"))

#THANKS