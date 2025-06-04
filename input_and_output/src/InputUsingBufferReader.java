import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputUsingBufferReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        System.out.println(i);
        br.close();
    }
}
