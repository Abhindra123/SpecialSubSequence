import java.util.Scanner;

public class SpecialSubSequence {
    public static int specialSubSequence(String word){
        char arr[]=word.toCharArray();
        int a_count=0;
        int seq_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){
                a_count=a_count+1;
            }
            else if(arr[i]=='G'){
                seq_count=seq_count+a_count;
            }
        }
        return seq_count;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word=sc.nextLine();
    int val=specialSubSequence(word);
        System.out.println("the value is : "+val);
    }
}