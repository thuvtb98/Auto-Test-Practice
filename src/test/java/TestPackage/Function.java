package TestPackage;

public class Function {
  static void InputData(int arr[], int number_value)
  {
    for(int i = 0; i < arr.length; i++)
    {
      arr[i] = number_value;
    }
  }

  static void PrintData(int arr[], int number_add)
  {
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println("Gia tri phan tu thu "+ (i+1) + " la " + (arr[i] + number_add));
    }
  }

  public static void main(String[] args)
  {
    int mang1[] = new int[10];

    InputData(mang1, 7);
    PrintData(mang1, 2);
  }
}
