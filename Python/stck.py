# stack merupakan struktur data yang bersifat LIFO (Last In First Out)
# artinya, data yang terakhir dimasukkan akan menjadi data yang pertama keluar
stack = []
stack.append("Amar") # data yang pertama dimasukkan
stack.append("Akbar")
stack.append("Anthony")
stack.append("Ram")
stack.append("Iqbal") # data yang terakhir dimasukkan

print(stack)

# contoh pengambilan data
print(stack.pop()) # data yang terakhir dimasukkan akan menjadi data yang pertama keluar
print(stack.pop())
  
print(stack)