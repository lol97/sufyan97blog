import cv2

cap = VideoCapture(0)

while(cap.isOpened()):
    ret,frame = cap.read()
    cv2.imshow("video",frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()

