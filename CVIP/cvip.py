=======================================================================================
LAB1
=======================================================================================
1. Read and Display

import cv2
imgPath="sunset.jpg"
img=cv2.imread(imgPath)
cv2.imshow("Sunset",img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
2. Image to gray and binary
import cv2
img_path="anemia.jpg"
img_colour=cv2.imread(img_path)
img_gray=cv2.cvtColor(img_colour,cv2.COLOR_BGR2GRAY)
_,img_binary=cv2.threshold(img_gray,127,255,cv2.THRESH_BINARY)
cv2.imshow("Original Image",img_colour)
cv2.imshow("Gray Image",img_gray)
cv2.imshow("Binary Image",img_binary)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
3. Affine Transformations
import cv2
import numpy as np
import cv2
import numpy as np
img_path="anemia.jpg"
img=cv2.imread(img_path)
rows,cols,_=img.shape
print(img.shape)
cv2.imshow("Original",img)
#1. Translation matrix
translation_matrix=np.float32([[1,0,50],[0,1,100]])
translated_img=cv2.warpAffine(img,translation_matrix,(cols,rows))
cv2.imshow("Translated",translated_img)
#2. Rotation
center=(cols//2,rows//2)
angle=45
scale=1.0
rotation_matrix=cv2.getRotationMatrix2D(center,angle,scale)
rotated_img=cv2.warpAffine(img,rotation_matrix,(cols,rows))
cv2.imshow("Rotated",rotated_img)
#Scaled
scaling_matrix=np.float32([[1.5,0,0],[0,1.5,0]])
scaled_image=cv2.warpAffine(img,scaling_matrix,(int(cols*2),int(rows*2)))
cv2.imshow("Scaled Image",scaled_image)
#sheared
sher_matrix=np.float32([[1,0.5,0],[0.5,1,0]])
sheared_image=cv2.warpAffine(img,sher_matrix,(int(cols*1.5),int(rows*1.5)))
cv2.imshow("Sheared Image",sheared_image)
cv2.waitKey(0)
cv2.destroyAllWindows()
=======================================================================================
LAB 2
=======================================================================================
1. Basic Intensity Transformations
import cv2
import numpy as np
import matplotlib.pyplot as plt
img_path="multicolour.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
def negative_transform(img):
    return 255-img
def log_transform(img):
    c=255/np.log(1+np.max(img))
    log_img=c*np.log(1+img.astype(np.float32))
    return np.uint8(log_img)
def gamma_transform(img,gamma):
    return np.array(255*(img/255)**gamma,dtype=np.uint8)
negative_img=negative_transform(img)
log_img=log_transform(img)
gamma_img=gamma_transform(img,gamma=2.0)
cv2.imshow("Negative",negative_img)
cv2.imshow("Log",log_img)
cv2.imshow("Gamma",gamma_img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
2. Contrast Stretching
import numpy as np
import cv2
import matplotlib.pyplot as plt
img_path="c.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the path and try again.")
else:
    def constrast_stretch(img):
        min_val=np.min(img)
        max_val=np.max(img)
        stretched_img=255*(img-min_val)/(max_val-min_val)
        return np.uint8(stretched_img)
    stretched_img=constrast_stretch(img)
    cv2.imshow("Original",img)
    cv2.imshow("stretched_img",stretched_img)
    cv2.waitKey(0)
		cv2.destroyAllWindows()
---------------------------------------------------------------------------------------   
3. Intensity Level Slicing
import numpy as np
import cv2
import matplotlib.pyplot as plt
img_path="multicolour.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
height,width=img.shape
sliced_img=np.zeros((height,width),dtype=np.uint8)
min_range=100
max_range=100
for i in range(height):
    for j in range(width):
        if min_range<=img[i,j]<=max_range:
            sliced_img[i,j]=255
        else:
            sliced_img[i,j]=0
cv2.imshow("Original",img)
cv2.imshow("sliced_img",sliced_img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
4. Bit Plane Slicing
import numpy as np
import cv2
import matplotlib.pyplot as plt
img_path="multicolour.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the path and try again.")
else:
    bit_planes=[]
    for i in range(8):
        bit_plane=(img>>i)&1
        bit_planes.append(bit_plane*255)
    plt.figure(figsize=(12,6))
    for i in range(8):
        plt.subplot(2,4,i+1)
        plt.title(f"BitPlane {i}")
        plt.imshow(bit_planes[i],cmap="gray")
        plt.axis('off')
    plt.tight_layout()
    plt.show()
---------------------------------------------------------------------------------------  
5. Histogram
import cv2
import numpy as np
import matplotlib.pyplot as plt
image_path="einstein.jpg"
image=cv2.imread(image_path,cv2.IMREAD_GRAYSCALE)
if image is None:
    print("Error cannot load image")
else:
    histogram=cv2.calcHist([image],[0],None,[256],[0,256])
    plt.figure(figsize=(8,6))
    plt.title("Grayscale Histogram")
    plt.xlabel("Pixel Intensity")
    plt.ylabel("Frequency")
    plt.plot(histogram,color='black')
    plt.xlim([0,256])
    plt.grid()
    plt.show()
--------------------------------------------------------------------------------------- 
6. Histogram Equalisation
import cv2
import numpy as np
import matplotlib.pyplot as plt
image_path="einstein.jpg"
image=cv2.imread(image_path,cv2.IMREAD_GRAYSCALE)
if image is None:
    print("Error cannot load image")
else:
    equalized_image=cv2.equalizeHist(image)
    stacked_images=np.hstack((image,equalized_image))
    cv2.imshow("Input Image vs Equalized Image",stacked_images)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
7. Histogram Processing
import cv2
import numpy as np
import matplotlib.pyplot as plt
image_path="c.jpg"
image = cv2.imread(image_path,cv2.IMREAD_GRAYSCALE)
if image is None:
    print("Error: Unable to load image.Please check the file path")
else:
    def histogram_stretching(image):
        min_val = np.min(image)
        max_val = np.max(image)
        stretched = (image - min_val) * (255 / (max_val - min_val))
        return np.uint8(stretched)
    stretched_image = histogram_stretching(image)
    def histogram_slicing(image, slide_value):
        return np.clip(image + slide_value, 0, 255)
    def histogram_shrinking(image, shrink_factor):
        center = 128
        return np.clip(center + (image - center) / shrink_factor, 0, 255).astype(np.uint8)
    slid_image = histogram_slicing(image, slide_value=50)
    shrunk_image = histogram_shrinking(image, shrink_factor=2)
    def plot_histogram(image, title):
        histogram = cv2.calcHist([image], [0], None, [256], [0, 256])
        plt.plot(histogram, label=title)
    plt.figure(figsize=(10,6))
    plt.title("Histograms")
    plot_histogram(image, "Original Image")
    plot_histogram(stretched_image, "Stretched Image")
    plot_histogram(slid_image, "Slided Image")
    plot_histogram(shrunk_image, "Shrunk Image")
    plt.xlabel("Pixel Intensity")
    plt.ylabel("Frequency")
    plt.legend()
    plt.grid()
    plt.show()
    titles = ["Original Image", "Stretched Image", "Slided Image", "Shrunk Image"]
    images = [image, stretched_image, slid_image, shrunk_image]
    plt.figure(figsize=(12,8))
    for i in range(4):
        plt.subplot(2,2,i+1)
        plt.imshow(images[i], cmap="gray")
        plt.title(titles[i])
        plt.axis("off")
    plt.tight_layout()
    plt.show()
    #INSTEAD USE CV2.IMSHOW()
=======================================================================================
LAB 3
=======================================================================================
1. 1D Correlation
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
  print("Error")
else:
  kernel=np.array([1,0,-1])
  horizontal_correlation=cv2.filter2D(img,-1,kernel.reshape(1,-1))
  vertical_correlation=cv2.filter2D(img,-1,kernel.reshape(-1,1))
  combined=np.hstack((img,horizontal_correlation,vertical_correlation))
  cv2.imwrite("combined.jpg",combined)
  cv2.imshow("combined",combined)
  cv2.waitKey(0)
  cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
2. 1D Convolution
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
  print("Error")
else:
  kernel=np.array([1,-1])
  horizontal_convolution=cv2.filter2D(img,-1,kernel.reshape(1,-1))
  vertical_convolution=cv2.filter2D(img,-1,kernel.reshape(-1,1))
  combined=np.hstack((img,horizontal_convolution,vertical_convolution))
  cv2.imshow("combined",combined)
  cv2.waitKey(0)
  cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
3. Smoothing Linear Filters
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
  print("Error")
else:
  gaussianBlur=cv2.GaussianBlur(img,(5,5),0)
  box_filtered=cv2.blur(img,(5,5))
  medianBlur=cv2.medianBlur(img,5)
  combined=np.hstack((img,gaussianBlur,box_filtered,medianBlur))
  cv2.imshow("combined",combined)
  cv2.waitKey(0)
  cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
4. Non Linear Filters
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
  print("Error")
else:
  median_f=cv2.medianBlur(img,5)
  kernel=np.ones((3,3),np.uint8)
  min_f=cv2.erode(img,kernel)
  max_f=cv2.dilate(img,kernel)
  combined=np.hstack((img,median_f,min_f,max_f))
  cv2.imshow("combined",combined)
  cv2.waitKey(0)
  cv2.destroyAllWindows()
=======================================================================================
LAB 4
=======================================================================================
1. Sharpening Kernel
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
  print("Error")
else:
  sharpening_kernel=np.array([[0,-1,0],[-1,5,-1],[0,-1,0]])
  sharpened_img=cv2.filter2D(img,-1,sharpening_kernel)
  cv2.imshow("Original",img)
  cv2.imshow("Sharpened",sharpened_img)
  cv2.waitKey(0)
  cv2.destroyAllWindows()
=======================================================================================
LAB 5
=======================================================================================
1. Frequency domain filtering
import cv2
import numpy as np
import matplotlib.pyplot as plt
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to read image. Please check the file path.")
else:
    dft=np.fft.fft2(img)
    dft_shift = np.fft.fftshift(dft)
    magnitude_spectrum = 20*np.log(np.abs(dft_shift))
    rows, cols = img.shape
    crow,ccol = rows//2, cols//2
    mask=np.zeros((rows,cols),np.uint8)
    radius=50
    cv2.circle(mask,(crow,ccol) , radius ,1, thickness=-1)
    low_pass=dft_shift*mask
    low_pass_ift=np.fft.ifftshift(low_pass)
    low_pass_img=np.abs(np.fft.ifft2(low_pass_ift))
    high_pass=dft_shift*(1-mask)
    high_pass_ift=np.fft.ifftshift(high_pass)
    high_pass_img=np.abs(np.fft.ifft2(high_pass_ift))
    cv2.imshow("Original Image",img)
    cv2.imshow("Magnitude Spectrum",magnitude_spectrum)
    cv2.imshow("Low-Pass Filtered",low_pass_img)
    cv2.imshow("High-Pass Filtered",high_pass_img)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
=======================================================================================
LAB 6
=======================================================================================
1. Image restoration and reconstruction
import cv2
import numpy as np
import matplotlib.pyplot as plt
from scipy.signal import wiener
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the file path.")
else:
    img=cv2.normalize(img,None,0,255,cv2.NORM_MINMAX).astype(np.uint8)
    mean=0
    stddev=25
    gaussian_noise=np.random.normal(mean,stddev,img.shape).astype(np.uint8)
    noisy_img=cv2.add(img,gaussian_noise)
    noisy_img=cv2.normalize(noisy_img,None,0,255,cv2.NORM_MINMAX).astype(np.uint8)
    restored_img=wiener(noisy_img,(5,5))
    restored_img=np.clip(restored_img,0,255).astype(np.uint8)
    cv2.imshow("Original Image",img)
		cv2.imshow("Noisy Image",noisy_img)
    cv2.imshow("Restored Image",restored_img)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
=======================================================================================
LAB 7
=======================================================================================
1. Erosion and Dilation
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the file path.")
else:
    kernel=np.ones((5,5),np.uint8)
    eroded_img=cv2.erode(img,kernel,iterations=1)
    dilated_img=cv2.dilate(img,kernel,iterations=1)
    cv2.imshow("Original Image",img)
    cv2.imshow("Eroded Image",eroded_img)
    cv2.imshow("Dilated Image",dilated_img)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
2. Opening and Closing
import cv2
import numpy as np
cap = cv2.VideoCapture(0)
if not cap.isOpened():
    print("Error: Unable to access the webcam.")
else:
    while True:
        ret, frame = cap.read()
        if not ret:
            print("Error:Failed to capture frame.")
            break
        hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
        lower_bound=np.array([30,50,50])
        upper_bound=np.array([90,255,255])
        mask=cv2.inRange(hsv,lower_bound,upper_bound)
        result=cv2.bitwise_and(frame,frame,mask=mask)
        kernel=np.ones((5,5),np.uint8)
        opening=cv2.morphologyEx(mask,cv2.MORPH_OPEN,kernel)
        closing=cv2.morphologyEx(mask,cv2.MORPH_CLOSE,kernel)
        cv2.imshow("Original Frame",frame)
        cv2.imshow("Mask",mask)
        cv2.imshow("Opening Operation",opening)
        cv2.imshow("Closing Operation",closing)
        if cv2.waitKey(1)&0xFF==ord('a'):
            break
    cap.release()
    cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
3. Hit or Miss
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the file path.")
else:
    kernel=np.array([[0,1,0],[1,-1,1],[0,1,0]],dtype=np.int8)
    hit_or_miss=cv2.morphologyEx(img,cv2.MORPH_HITMISS,kernel)
    cv2.imshow("Original Image",img)
    cv2.imshow("Hit-or-Miss Transform",hit_or_miss)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
=======================================================================================
LAB 8
=======================================================================================
1. Boundary Extraction
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
kernel=np.ones((3,3),np.uint8)
eroded_img=cv2.erode(img,kernel,iterations=1)
boundary=img-eroded_img
cv2.imshow("Original image",img)
cv2.imshow("Boundary Extracted",boundary)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
2. Convex Hull
import cv2
import numpy as np
img=cv2.imread("einstein.jpg")
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
_,binary=cv2.threshold(gray,127,255,cv2.THRESH_BINARY)
contours,_=cv2.findContours(binary,cv2.RETR_EXTERNAL,cv2.CHAIN_APPROX_SIMPLE)
hull_list=[cv2.convexHull(cnt) for cnt in contours]
cv2.drawContours(img,contours,-1,(0,255,0),2)
cv2.drawContours(img,hull_list,-1,(0,0,255),2)
cv2.imshow("Convex Hull",img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
3. Thinning
import cv2
import numpy as np
from skimage.morphology import skeletonize
img_path="world.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the file path.")
    exit()
_,binary=cv2.threshold(img,127,255,cv2.THRESH_BINARY)
binary=binary//255
skeleton=skeletonize(binary)
skeleton=(skeleton*255).astype(np.uint8)
cv2.imshow("Original Image",img)
cv2.imshow("Thinned Image(Skeleton)",skeleton)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
4. Thickening
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
    print("Error: Unable to load the image. Please check the file path.")
    exit()
_,binary=cv2.threshold(img,127,255,cv2.THRESH_BINARY)
kernel=np.ones((3,3),np.uint8)
thickened_img=cv2.dilate(binary,kernel,iterations=1)
cv2.imwrite("thickened_output.jpg",thickened_img)
cv2.imshow("Original image",binary)
cv2.imshow("Thickened image",thickened_img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
5. Skeletonization
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
_,binary=cv2.threshold(img,127,255,cv2.THRESH_BINARY)
kernel=np.ones((3,3),np.uint8)
skeleton=np.zeros(binary.shape,dtype=np.uint8)
while True:
    erode=cv2.erode(binary,kernel)
    temp=cv2.dilate(erode,kernel)
    skeleton_part=cv2.subtract(binary,temp)
    skeleton=cv2.bitwise_or(skeleton,skeleton_part)
    binary=erode.copy()
    if cv2.countNonZero(binary)==0:
        break
    cv2.imwrite("skeletonized_output.jpg",skeleton)
    cv2.imshow("Original Image",img)
    cv2.imshow("Skeletonized image",skeleton)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
=======================================================================================
LAB 9
=======================================================================================
1. Detection of Point
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path)
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
sift=cv2.SIFT_create()
keypoints=sift.detect(gray,None)
output_img=cv2.drawKeypoints(img,keypoints,None,color=(0,255,0),flags=cv2.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS)
cv2.imshow("Original Image",img)
cv2.imshow("SIFT Keypoints",output_img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
2. Detection of Line
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path)
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
edges=cv2.Canny(gray,50,150)
lines=cv2.HoughLinesP(edges,rho=1,theta=np.pi/180,threshold=100,minLineLength=50,maxLineGap=10)
if lines is not None:
    for line in lines:
        x1,y1,x2,y2=line[0]
        cv2.line(img,(x1,y1),(x2,y2),(0,255,0),2)
cv2.imwrite("detected_lines.png",img)
cv2.imshow("Original Image",cv2.imread("einstein.jpg"))
cv2.imshow("Detected Lines",img)
cv2.waitKey(0)
cv2.destroyAllWindows()
---------------------------------------------------------------------------------------
3. Detection of Edges
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path)
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
edges=cv2.Canny(gray,100,200)
cv2.imwrite("Edge_detected.png",edges)
cv2.imshow("Original Image",img)
cv2.imshow("Edge Detected Image",edges)
cv2.waitKey(0)
cv2.destroyAllWindows()
=======================================================================================
LAB 10
=======================================================================================
1. Image Segmentation
import cv2
import numpy as np
img_path="einstein.jpg"
img=cv2.imread(img_path,cv2.IMREAD_GRAYSCALE)
if img is None:
  print("Error")
else:
  _,binary_thresh=cv2.threshold(img,127,255,cv2.THRESH_BINARY)
  adaptive_thresh=cv2.adaptiveThreshold(img,255,cv2.ADAPTIVE_THRESH_GAUSSIAN_C,cv2.THRESH_BINARY,11,2)
  _,otsu_thresh=cv2.threshold(img,0,255,cv2.THRESH_BINARY+cv2.THRESH_OTSU)
  cv2.imshow("Binary",binary_thresh)
  cv2.imshow("Adaptive",adaptive_thresh)
  cv2.imshow("Otsu",otsu_thresh)
  cv2.waitKey(0)
  cv2.destroyAllWindows()
=======================================================================================
LAB 11
1. Feature Extraction(Detection)
import cv2
import numpy as np
img=cv2.imread("einstein.jpg")
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
edges=cv2.Canny(gray,100,200)
orb=cv2.ORB_create()
keypoints,descriptors=orb.detectAndCompute(gray,None)
orb_img=cv2.drawKeypoints(img,keypoints,None,color=(0,255,0),flags=0)
cv2.imshow("Original Image",img)
cv2.imshow("ORB Features",orb_img)
cv2.imshow("Canny Edge Detection",edges)
cv2.waitKey(0)
cv2.destroyAllWindows()
=======================================================================================
LAB 12
=======================================================================================
1. Object Detection using various classification techniques
import numpy as np
import cv2
img_path1 = r"einstein.jpg"
img = cv2.imread(img_path1)
if img is None:
    print("Error: Unable to load image.")
    exit()
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_default.xml")
eye_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_eye.xml")
if face_cascade.empty() or eye_cascade.empty():
    print("Error loading cascade classifiers.")
    exit()
faces = face_cascade.detectMultiScale(gray, scaleFactor=1.1, minNeighbors=5, minSize=(30, 30))
for (x, y, w, h) in faces:
    cv2.rectangle(img, (x, y), (x + w, y + h), (255, 0, 0), 2)
    roi_gray = gray[y:y + h, x:x + w]
    roi_color = img[y:y + h, x:x + w]
    eyes = eye_cascade.detectMultiScale(roi_gray)
    for (ex, ey, ew, eh) in eyes:
        cv2.rectangle(roi_color, (ex, ey), (ex + ew, ey + eh), (0, 255, 0), 2)
cv2.imwrite("object_detected.png", img)
cv2.imshow("Detected Objects", img)
cv2.waitKey(0)
cv2.destroyAllWindows()
=======================================================================================