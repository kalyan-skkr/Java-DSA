public class helper {
    public void sortAscending(int[] a){
        int count = a.length;
        for(int i = 0; i<count; i++){
            for(int j = i+1; j<count; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void sortDescending(int[] a){
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void printNumbers(int[] a){
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
