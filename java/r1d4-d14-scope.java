	// Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }