package org.vadim.epamtasks.task1;

public class StudList {
    private Student[] array;

    public StudList(Student ... obj){
        array = new Student[obj.length];
        int i = 0;
        for(Student x : obj) {
            array[i] = x;
            i++;
        }
    }

    public void addToList(Student ... obj){
        Student[] add = new Student[obj.length];
        int i = 0;
        for(Student x : obj) {
            add[i] = x;
            i++;
        }
        Student[] buffer = new Student[array.length];
        System.arraycopy(array, 0, buffer, 0, array.length);

        array = new Student[buffer.length + obj.length];
        System.arraycopy(buffer, 0, array, 0, buffer.length);
        if (array.length - buffer.length >= 0)
            System.arraycopy(add, 0, array, buffer.length, array.length - buffer.length);
    }

    public void printList(){
        System.out.println("Students List: ");
        for(Student x : array){
            System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName()
            + " (" + x.getFaculty() + ", " + x.getGroup() + ").");
        }
    }

    public void printFaculty(Faculty faculty){
        System.out.println("Faculty " + faculty + " List: ");
        for(Student x : array){
            if(faculty == x.getFaculty()) {
                System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName()
                        + " (" + x.getGroup() + ").");
            }
        }
    }

    public void printGroup(String group){
        System.out.println("Group " + group + " List: ");
        for(Student x : array){
            if(group == x.getGroup())
                System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName());
        }
    }

}
