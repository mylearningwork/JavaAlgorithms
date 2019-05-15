package com.sgsoftware.stringDemo;

class FindWordsInGivenStr
{
	void FindWords(String Sentence)
	{
		int count=1;
		for (int i = 0; i < Sentence.length(); i++)
		{
			if ((Sentence.charAt(i)==' ')&&(Sentence.charAt(i+1)!=' ')) 
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
public class WordsFindInSentence {

	public static void main(String[] args) 
	{
		
		FindWordsInGivenStr FW = new FindWordsInGivenStr();
		FW.FindWords("My name is Rajasekhar");
	}

}
