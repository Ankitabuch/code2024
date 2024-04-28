package april27.food;

interface Food {
        void display();
    }
    interface IndianFood extends Food {}
    interface ChineseFood extends Food {}

    class IndianFoodImpl implements IndianFood {
        String name;
        double price;


        public IndianFoodImpl(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public void display() {
            System.out.println("Indian Food:");
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    // ChineseFoodImpl class implementing ChineseFood interface
    class ChineseFoodImpl implements ChineseFood {
        String name;
        double price;

        public ChineseFoodImpl(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public void display() {
            System.out.println("Chinese Food:");
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    // IndianChineseFood class implementing both IndianFood and ChineseFood interfaces
    class IndianChineseFood implements IndianFood, ChineseFood {
        IndianFoodImpl indianFood;
        ChineseFoodImpl chineseFood;

        public IndianChineseFood(IndianFoodImpl indianFood, ChineseFoodImpl chineseFood) {
            this.indianFood = indianFood;
            this.chineseFood = chineseFood;
        }

        @Override
        public void display() {
            System.out.println("Combination of Indian and Chinese Food:");
            System.out.println("Indian Food:");
            indianFood.display();
            System.out.println("Chinese Food:");
            chineseFood.display();
        }
    }
