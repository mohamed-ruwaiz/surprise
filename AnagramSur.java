package myjava1;
import java.util.*;
public class AnagramSur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String s1="Listen";
				String s2="Silent";
				boolean result=false;
				s1=s1.toLowerCase();
				s2=s2.toLowerCase();
				char [] ch1=s1.toCharArray();
				char [] ch2=s2.toCharArray();
				if(ch1.length==ch2.length) {
					Arrays.sort(ch1);
					Arrays.sort(ch2);
					result=Arrays.equals(ch1, ch2);
					if(result) {
						System.out.println("It's Anagram");
					}
					else {
						System.out.println("OOPs! It's not a Anagram");
					}
				}else {
					System.out.println("OOPs! It's not a Anagram");
				}
			}
		}
	
