class EmpAtt { 
    
    static void segregate(int arr[], int n) 
    { 
        int count = 0;
      
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                count++; 
        } 
  
        for (int i = 0; i < count; i++) 
            arr[i] = 0; 
  
        for (int i = count; i < n; i++) 
            arr[i] = arr[i]; 
    } 
      
    static void print(int arr[], int n) 
    { 
        System.out.print("Array after segregation is "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");     
    } 
      
    public static void main(String[] args) 
    { 
        int arr[] = new int[]{ 0,10,43,27,0,98,75,59,191,0}; 
        int n = arr.length; 
  
        segregate(arr, n); 
        print(arr, n); 
          
    } 
}
