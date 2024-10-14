class Main{
    public static void main(String[] args){
    IImmutableList list1 = new ImmutableList(new int[]{1,2,3});
    IImmutableList list2 = new ImmutableList(list1);
    IImmutableList list3 = list1.concat(list2);
    IImmutableList list4 = new ImmutableList(new int[]{4,5,6,7});
    IImmutableList list5 = list1.concat(list4.concat(list3));
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
    System.out.println(list4);
    System.out.println(list5); 
    }
   }
   