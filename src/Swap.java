public class Swap {
    //Tapşırıq 3: Generic metod, swap
    //
    //Massivdə iki elementin yerini dəyişən metod yaz:
    public <T> void swap(T[] array,int i,int j){
        T temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
