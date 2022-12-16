package com.example.kakelandet_mycookbook

// Dummy data to inflate the recipe list while the database is not set

fun recipeList(): List<Recipe> {
    return listOf(
        Recipe(
            id = 1,
            title = "Roasted Potatoes",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 2,
            title = "Strawberry Cake",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 3,
            title = "Roast-beef",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 4,
            title = "Roll Cake",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 5,
            title = "Vanilla Cupcakes",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 6,
            title = "Mirror Cake",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 7,
            title = "Turkey",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 8,
            title = "Brigadeiro",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        ),
        Recipe(
            id = 10,
            title = "Caramel Flan",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et lorem maximus, facilisis dui sit amet, maximus magna. Vivamus feugiat vestibulum luctus. Cras sed risus id lectus lobortis scelerisque. Mauris at congue dolor, eu dictum odio. Nunc augue felis, aliquet ac ultrices quis, hendrerit et ligula. Nulla facilisi. Suspendisse imperdiet quam et turpis mattis, vitae facilisis nibh ultrices. Duis egestas nibh varius nunc porttitor scelerisque. Nulla ac diam semper erat elementum ullamcorper at pharetra justo. Donec bibendum euismod mauris, id euismod ipsum lobortis ut. Aliquam non orci vestibulum, semper risus eget, blandit lorem.",
            image = R.drawable.ic_serves,
            serving = "6",
            time = "2h",
            servingIcon = R.drawable.ic_serves,
            timeIcon = R.drawable.ic_time
        )
    )
}