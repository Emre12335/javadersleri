package d7;
/* Bu derste public,protected, none, ve private arasındaki farkı göstereceğiz. */
/* Bunu direk stackoverflowdan bakacağız. */
/*
In Java there are public, protected, package (default), and private visibilities; ordered from most visible to the least.
If you do not specify it, by default the visibility is package.
 */
public class d7 {
    public int myPublicInt; // visible to all
    protected int myProtectedInt; // visible to subclasses of d7 and to other members of the javadersleri.d7 package
    int myPackageInt; // visible only to other members of the javadersleri.d7 package
    private int myPrivateInt; // visible only to MyClass objects
}
/* Gelecek ders artık instance variablelara geçip başka ileri seviye kavramları göreceğiz */