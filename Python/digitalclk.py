from tkinter import Tk, Label, Button
import time

master = Tk()
master.title("Digital Clock")

def get_time():
    current_time = time.strftime("%H:%M:%S %p")
    current_date = time.strftime("%A, %B %d, %Y")
    clock.config(text=current_time)
    date_label.config(text=current_date)
    
    hour = int(time.strftime("%H"))
    if 6 <= hour < 19:
        master.config(bg="lightblue")
        clock.config(bg="lightblue", fg="darkblue")
        date_label.config(bg="lightblue", fg="darkblue")
    else:
        master.config(bg="black")
        clock.config(bg="black", fg="white")
        date_label.config(bg="black", fg="white")

    clock.after(200, get_time)

date_label = Label(master, font=("Arial", 20), bg="black", fg="white")
date_label.pack(pady=10)
clock = Label(master, font=("Arial", 80), bg="black", fg="white")
clock.pack()

get_time()
master.mainloop()
