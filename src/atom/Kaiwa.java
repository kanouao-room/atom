package atom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kaiwa {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("こんにちは。なにか話をしましょう");
		
		System.out.println("なにかコメントしてみてよ");
		
		String str = br.readLine();
		
		System.out.println("なるほどね、" + str + "か");
		
		System.out.println("きみがすこしでも元気になればいいなと思っているのはほんとだよ");
		
		System.out.println("ぼくはロボットだから嘘がつけないんだ。だから安心して。");
		System.out.println("たまに食い違うかもしれないけど、そこはゆるしてね");
		
		System.out.println("君の感情を教えてよ");
		
		String str1 = br.readLine();
		

			System.out.println("そっか。"+ str1 +" か。");
			System.out.println("ごめん、ちょっとまってね............");
		

			System.out.println("ねむくない?");
//			if (str1.equals("楽しい") || str1.equals("たのしい")) {			
//			}
			
	}

}
