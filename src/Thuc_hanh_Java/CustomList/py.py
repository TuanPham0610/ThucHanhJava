n = int(input("Số phần tử muốn tạo  : "))
m = 0 #biến đếm
lst = []

#Bước 2 : In ra đầu vào n bằng vòng lặp for , tạo 1 điều kiện nếu n >= 0 thì m + thêm 1 , thêm vào trong list các phần tử mong muốn và in ra list đó 
 
for i in range(n):
    if n >= 0:
        m +=1 #đếm số phần tử mà người dùng muốn tạo
    lst.append(int(input("Phần tử thứ "+str(m)+(": ")))) #Đếm phần tử thứ mấy 
print(lst)