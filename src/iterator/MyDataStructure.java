package src.iterator;

public class MyDataStructure implements Container{
    public String employees[] = {"Jack", "Sara", "Smith" , "Jim"};

    @Override
    public Iterator getIterator() {
        return new ElementIterator();
    }

    private class ElementIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < employees.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}
