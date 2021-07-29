

import java.util.Arrays;

class sort_an_array_according_to_the_order_defined_by_another_array {

// Binary search
static int first(int arr[], int low, int high,int x, int n)
{
if (high >= low)
{
int mid = low + (high-low)/2;

if ((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
return mid;
if (x > arr[mid])
return first(arr, (mid + 1), high,x, n);
return first(arr, low, (mid -1), x, n);
}
return -1;
}

// Sort according to the order defined by array 2
static void sort_according(int arr1[], int arr2[], int m, int n)
{

int temp[] = new int[m], visited[] = new int[m];
for (int i = 0; i < m; i++)
{
temp[i] = arr1[i];
visited[i] = 0;
}

// Sort elements in temp
Arrays.sort(temp);
int ind = 0;

for (int i = 0; i < n; i++)
{

int f = first(temp, 0, m-1, arr2[i], m);

// If not present, no need to proceed
if (f == -1) continue;

// Copy all occurrences of arr2[i] to arr1[]
for (int j = f; (j < m && temp[j] == arr2[i]);j++)
{
arr1[ind++] = temp[j];
visited[j] = 1;
}
}

for (int i = 0; i < m; i++)
if (visited[i] == 0)
arr1[ind++] = temp[i];
}

// Function to print an array
static void print_array(int arr[], int n)
{
for (int i = 0; i < n; i++)
System.out.print(arr[i] + " ");
System.out.println();
}

public static void main(String args[])
{
int arr1[] = {1, 2, 3, 4, 3, 2, 4, 2, 5};
int arr2[] = {4, 2, 1, 3};
int m = arr1.length;
int n = arr2.length;
System.out.print("The Sorted array : ");
sort_according(arr1, arr2, m, n);
print_array(arr1, m);
}
}