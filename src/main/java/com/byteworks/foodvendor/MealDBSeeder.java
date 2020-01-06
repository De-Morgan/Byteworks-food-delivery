package com.byteworks.foodvendor;

import com.byteworks.foodvendor.models.Meal;
import com.byteworks.foodvendor.services.MealService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class MealDBSeeder  implements CommandLineRunner {

    private MealService mealService;

    public MealDBSeeder(MealService mealService) {
        this.mealService = mealService;
    }

    @Override
    public void run(String... args) throws Exception {

        Meal grilledChicken = new Meal("Grilled Chicken", 1000, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal poundedYam = new Meal("Pounded Yam",250,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal edikaikong = new Meal("Edikaikong",500,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal jollof = new Meal("Jollof Rice",450,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal spaghetti = new Meal("Spaghetti",550,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal beanPottage = new Meal("Bean Pottage", 350,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal beaf = new Meal("Beef",350,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal asun = new Meal("Asun",1200,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal gizzard = new Meal("Gizzard", 450,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");
        Meal boiledEgg = new Meal("Boiled Egg",150,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac feugiat justo, vel laoreet eros. Sed ac dignissim mi. Maecenas nisi felis, eleifend ut ultrices sed, ultrices tempor nibh. Ut at blandit nibh. Duis consectetur non ante eget pretium. Quisque eu facilisis neque. Curabitur tincidunt, magna in imperdiet ornare, ante mauris finibus justo, et dapibus ipsum ex vel metus. Nunc posuere dapibus sollicitudin. Integer venenatis fringilla ullamcorper. Praesent in lectus vitae sapien congue mollis ut sed purus. Integer non imperdiet risus.");

        mealService.deleteAll();


        List<Meal> hotels = Arrays.asList(grilledChicken,poundedYam,edikaikong,jollof,spaghetti,beanPottage,beaf,asun,gizzard,boiledEgg);
        mealService.saveAll(hotels);

    }
}
