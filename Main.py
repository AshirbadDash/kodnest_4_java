import os
import shutil

def remove_duplicates(directory):
    seen = set()
    for filename in os.listdir(directory):
        full_path = os.path.join(directory, filename)
        if os.path.isdir(full_path) and not os.listdir(full_path):
            print(f"Processing directory: {full_path}")
            if filename in seen:
                print(f"Deleting duplicate directory: {full_path}")
                shutil.rmtree(full_path)
            else:
                seen.add(filename)

remove_duplicates(r"C:\Users\ashir\December")  # using a raw string