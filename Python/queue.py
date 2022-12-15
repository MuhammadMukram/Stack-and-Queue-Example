# queue merupakan struktur data yang bersifat FIFO (First In First Out)
# artinya, data yang pertama dimasukkan akan menjadi data yang pertama keluar
from collections import deque # import modul deque dari collections di python untuk menjalankan struktur data queue
queue = deque()

queue.append("Amar") # data yang pertama dimasukkan
queue.append("Ram")
queue.append("Iqbal")
queue.append("Akbar")
queue.append("Birbal") # data yang terakhir dimasukkan

print(queue)

# contoh pengambilan data
print(queue.popleft()) # data yang pertama dimasukkan akan menjadi data yang pertama keluar
print(queue.popleft())
print(queue)