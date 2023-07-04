package com.excitedbroltd.freshfood.ui.screens.splashscreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.dataclass.SkipDataCalls
import com.excitedbroltd.freshfood.nav.Screen
import com.excitedbroltd.freshfood.ui.theme.DeepGreen
import com.excitedbroltd.freshfood.ui.theme.LightGray

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Skip(navController: NavHostController) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
        4
    }

    val skip = listOf(
        SkipDataCalls(
            "Welcome to",
            "Fresh Food grocery ",
            "application",
            "Fresh food online grocery store is the no 1",
            " grocery application in the world",
            R.drawable.skip1
        ),
        SkipDataCalls(
            "Best Quality",
            "grocery at your",
            "doorstep",
            "Fresh food online grocery store is the no 1",
            " grocery application in the world",
            R.drawable.skip2
        ),
        SkipDataCalls(
            "Welcome to",
            "Fresh Food grocery ",
            "application",
            "Fresh food online grocery store is the no 1",
            " grocery application in the world",
            R.drawable.skip3
        ),
        SkipDataCalls(
            "Big savings with",
            "seasonal discount",
            "on all products",
            "Fresh food online grocery store is the no 1",
            " grocery application in the world",
            R.drawable.skip4
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            ), contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            // pageNumber = it
            HorizontalPager(
                modifier = Modifier,
                state = pagerState,
                pageSpacing = 0.dp,

                userScrollEnabled = true,
                reverseLayout = false,
                contentPadding = PaddingValues(0.dp),
                beyondBoundsPageCount = 0,
                pageSize = PageSize.Fill,
                key = null,
                pageNestedScrollConnection = PagerDefaults.pageNestedScrollConnection(
                    Orientation.Horizontal
                ),
                pageContent = {
                    // pageNumber = it
                    val mskip = skip[it]
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(top = 100.dp)
                                .size(300.dp),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = mskip.pictureId),
                                contentDescription = mskip.title1
                            )
                        }
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = mskip.title1,
                                style = MaterialTheme.typography.titleLarge,
                                textAlign = TextAlign.Center,
                                fontSize = 30.sp
                            )
                            Text(
                                text = mskip.title2,
                                style = MaterialTheme.typography.titleLarge,
                                textAlign = TextAlign.Center,
                                fontSize = 30.sp
                            )
                            Text(
                                text = mskip.title3,
                                style = MaterialTheme.typography.titleLarge,
                                textAlign = TextAlign.Center,
                                fontSize = 30.sp
                            )
                        }
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(
                                text = mskip.desc1,
                                style = MaterialTheme.typography.bodySmall,
                                color = LightGray
                            )
                            Text(
                                text = mskip.desc2,
                                style = MaterialTheme.typography.bodySmall,
                                color = LightGray
                            )
                        }
                    }
                }
            )


            Column() {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    for (i in 0..3) {
                        Text(
                            text = ".",
                            style = MaterialTheme.typography.titleLarge,
                            color = if (pagerState.currentPage == i) DeepGreen else LightGray
                        )
                    }

                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 45.dp, start = 25.dp, end = 25.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        navController.navigate(Screen.LogIn.route) {
                            popUpTo(Screen.Skip.route) {
                                inclusive = true
                            }
                        }
                    }
                    .background(DeepGreen)
                    .padding(13.dp), contentAlignment = Alignment.Center) {
                    Text(
                        text = if (pagerState.currentPage == 3) "Next" else "Skip",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.8f)
                    )
                }
            }
        }
    }


}