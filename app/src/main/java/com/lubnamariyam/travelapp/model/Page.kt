package com.lubnamariyam.travelapp.model

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.lubnamariyam.travelapp.R

data class Page(@DrawableRes val image1:Int, @StringRes val title: Int, @StringRes val description: Int,
                @DrawableRes val image: Int)


@SuppressLint("ResourceType")
val onboardPages = listOf(
    Page(
        image1=R.drawable.image_1,
        title =R.string.kalido,
        description = R.string.des1,
        image =0,

    ),
    Page(
        image1=0,
        R.string.Uncover_hidden_opportunities,
        R.string.des2,
        image =R.drawable.image2
    ),
    Page(
        image1=0,
        R.string.Discover_your_true_skills_ecosystem,
        R.string.des3,
        image =R.drawable.image3
    ),
    Page(
        image1=0,
        R.string.Create_strong_engaged_teams,
        R.string.des4,
        image =R.drawable.image4
    ),
    Page(
        image1=0,
        R.string.Increase_producivity_and_well_being,
        R.string.des5,
        image =R.drawable.image5
    ),
    Page(
        image1=0,
        R.string.Build_communities,
        R.string.des6,
        image =R.drawable.image6
    )

)