import java.util.ArrayList;
import java.util.Collections;

public class DepartmentMain {
    public static void main(String args[]) {
        ArrayList<Department> arrayList = new ArrayList<Department>();

       arrayList.add(new Department(102,"ECE"));
       arrayList.add(new Department(101,"EEE"));
        System.out.println("Department Sorting Name");
       Collections.sort(arrayList,Department.departName);
       for (Department department:arrayList){
           System.out.println(department);
       }

        System.out.println("Department Sorting Order");
        Collections.sort(arrayList,Department.departID);
        for (Department department:arrayList){
            System.out.println(department);

        }
    }
}