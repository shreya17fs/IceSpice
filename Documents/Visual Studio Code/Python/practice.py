"""list1 = ["delhi","up","mumbai"]
def printlen(list):
    print(len(list))
printlen(list1)"""

# def cal_fact(n):
#     fact=1
#     for i in range(1, n+1):
#         fact *= i
#     print(fact)
# cal_fact(5)

# def show(name, *sub):
#     print("\n", name,"Like to read")
#     for i in sub:
#         print(i)
# show("Rahul", "c","c++")
# show("Mayank","ds","java","dbms")
# show("Rajesh")

# def swap(x,y):
#     x,y = y,x
#     return(x,y)
# a=10
# b=20
# print(a,b)
# c,d = swap(a,b)
# print(c,d)

# def small(a,b):
#     if(a<b):
#         return a
#     else:
#         return b
# sum = lambda x,y : x+y
# diff = lambda x,y : x-y
# print(small(sum(-3,-2),diff(-1,2)))


# def show(n):
#     if(n==0):
#         return
#     print(n)
#     show(n-1)
#     print("END")
# show(6)

# def fib(n):
#     if(n<2):
#         return 1
#     return (fib(n-1) + fib(n-2))
# n = int(input("Enter a no. : "))
# for i in range(n):
#     print(fib(i))

# def test(y):
#     y = y+20
#     print(y)
# y=10
# test(y)
# print(y)


# def test(list):
#     list.append(20)
#     list.extend([30,40,50])
#     print(list)
#     list.remove(30)
#     print(list)
# list1 = [10]
# print(list1)
# test(list1)
# print(list1)

# print("Hello")
# print("Name of module is ", __name__)

# class test:
#     __var1 = 20
#     def disp(self,name,age):
#         print("name=",name,"age=",age,"var1=",self.__var1)
# p1=test()
# p1.disp("Ravi",30)

# class test:
#     def __init__(self,name,age):
#         name = name
#         age=age
#         print(name,age)
# p1 = test("Ravi",35)

# class test :
#     var1=0
#     def __init__(self,var2):
#         test.var1 += 1
#         self.var2 = var2
#         print("var2 = ",var2)
# p1 = test(10)
# p2 = test(20)
# p3 = test(30)
# print(p1.var1,p2.var1,p3.var1)

# class test:
#     var1 = 0
#     def __init__(self,var2):
#         test.var1 += 1
#         var2 = var2
#         print("The value of obj is ",var2)
#         print("The object created ",test.var1)
#     def __del__(self):
#         print("The object destroyed ",test.var1)
#         test.var1 -= 1
# t1 = test(10)
# t2 = test(20)
# t3 = test(30)
# del t1
# del t2
# del t3

# class test:
#     def __init__(self,var):
#         self.var = var
#     def disp(self):
#         print("var is ",self.var)
# t1 = test(10)
# t1.disp()
# print("Check if obj has attribute var ",hasattr(t1,'var'))
# setattr(t1,'var',50)
# print("After change value is ",t1.var)
# setattr(t1,'var2',100)
# print("New attribute is created ",t1.var2)
# delattr(t1,'var')
# print("After deleting the attribute ",t1.var)

# class complex:
#     def __init__(self):
#         self.real = float(input("Enter real part "))
#         self.imag = float(input("Enter imaginary part "))
#     def disp(self):
#         print("Entered no. is ",self.real,"+",self.imag,"i")
#     def sum(self,c1,c2):
#         self.real = c1.real + c2.real
#         self.imag = c1.imag + c2.imag
# c1 = complex()
# c2 = complex()
# c3 = complex()
# c1.disp()
# c2.disp()
# c3.sum(c1,c2)
# c3.disp()


# class Time:
#     def __init__(self, hour=0, minute=0):
#         self.hour = hour
#         self.minute = minute
#         if (hour == 0 and minute == 0):
#             self.hour = int(input("Enter hours: "))
#             self.minute = int(input("Enter minutes: "))

#     def disp(self):
#         print(f"Time is {self.hour} hours and {self.minute} minutes")

#     def sum(self, t1, t2):
#         total_minutes = t1.minute + t2.minute
#         total_hours = t1.hour + t2.hour + total_minutes // 60
#         self.minute = total_minutes % 60
#         self.hour = total_hours

# # Create instances of Time
# t1 = Time()
# t2 = Time()

# # Display the input times
# t1.disp()
# t2.disp()

# # Summing the times without asking for input again
# t3 = Time(0, 0)  # Initialize with zeros
# t3.sum(t1, t2)

# # Display the result
# t3.disp()

# class A :
#     _a = 10
#     __b = 20
#     def show(self):
#         print("a=" , self._a)
#         print("b=", self.__b)
# obj = A()
# obj.show()
# print("Outside", obj._a)
# print("outsie", obj.__b)

str1 = input("Enter a string ")
reverse = str1[len(str1)::-1]
if(str1 == reverse):
    print("Palindrome")
else:
    print("Not a palindrome")