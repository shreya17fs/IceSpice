#include <stdio.h>

struct Student {
    int rollNo;
    char name[50];
    float marks;
};

int hash(int key, int size) {
    return key % size;
}

int main() {
    FILE *file[10]; // Assuming 10 buckets for simplicity
    struct Student student;

    // Creating hash file
    for (int i = 0; i < 10; i++) {
        char filename[20];
        sprintf(filename, "bucket%d.dat", i);
        file[i] = fopen(filename, "wb");
        if (file[i] == NULL) {
            printf("Error opening file %s.\n", filename);
            return 1;
        }
    }

    // Writing records to the hash file
    for (int i = 0; i < 5; i++) {
        printf("Enter details for student %d:\n", i + 1);
        printf("Roll No: ");
        scanf("%d", &student.rollNo);
        printf("Name: ");
        scanf("%s", student.name);
        printf("Marks: ");
        scanf("%f", &student.marks);

        int bucket = hash(student.rollNo, 10);
        fwrite(&student, sizeof(struct Student), 1, file[bucket]);
    }

    // Closing files
    for (int i = 0; i < 10; i++) {
        fclose(file[i]);
    }

    return 0;
}
