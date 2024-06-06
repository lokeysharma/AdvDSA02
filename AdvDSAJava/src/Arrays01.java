public class Arrays01 {

    public int CountFactors(int A){

        int count = 1;
        int i = 0;
        for (i = 2; i * i <= A; i++) {
            if(A%i == 0){
                count+=2;
            }
        }

        if(i*i == A) {
            count--;
        }

        return count;
    }
}
