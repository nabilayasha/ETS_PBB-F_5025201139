package com.example.yasha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yasha.ui.theme.YashaTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YashaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Compose column berguna agar child tampilan yang berada di dalamnya akan vertical,
                    // modifier vertical scroll berguna agar view dapat discroll secara vertical
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        //Untuk menampilkan appbar
                        TopAppBar(
                            //untuk memanggil icon menu / hamburger menu
                            navigationIcon = {
                                Icon(Icons.Outlined.Menu, contentDescription = "hamburger")
                            },
                            //untuk memasukkan logo its
                            title = {
                                Icon(
                                    painter = painterResource(id = R.drawable.appbar_hd),
                                    contentDescription = "Logo"
                                )
                            },
                            //Berguna untuk menambahkan padding dan shadow
                            modifier = Modifier
                                .wrapContentSize()
                                .shadow(
                                    elevation = 16.dp
                                )
                                .padding(4.dp)

                        )


                        //Compose column awal content
                        Column(
                            modifier = Modifier

                                .padding(32.dp)
                        ) {
                                //Memberikan jarak vertical
                            Spacer(modifier = Modifier.height(2.dp))
                            //Menambahkan teks Tugas Akhir dengan style fontsize, color dan fontweight
                            Text(
                                text = "Tugas Akhir",
                                fontSize = 24.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            //Memberikan jarak vertical
                            Spacer(modifier = Modifier.height(32.dp))
                            //Untuk membuat header berwarna biru dan untuk mengatur tepi kiri dan kanan menjadi rounded
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .shadow(
                                        elevation = 2.dp,
                                        shape = RoundedCornerShape(16.dp),
                                    ),
                            ) {
                                // Konten lainnya dan konten didalamnya menjadi vertical
                                Column {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .background(Color(0xff2B67D9))
                                    ) {
                                        //Menambahkan teks menu dan serba serbi tugas akhir anda
                                        Column(
                                            modifier = Modifier.padding(
                                                horizontal = 16.dp,
                                                vertical = 8.dp
                                            )
                                        ) {
                                            Text(
                                                text = "Menu",
                                                fontSize = 24.sp,
                                                color = Color.White
                                            )
                                            Text(
                                                text = "Serba serbi tugas akhir Anda",
                                                fontSize = 16.sp,
                                                color = Color.White
                                            )
                                        }

                                    }

                                    //Untuk mengatur konten menjadi horizontal
                                    Row(modifier = Modifier.padding(16.dp)) {
                                        Icon(
                                            Icons.Outlined.Person, "Person", modifier = Modifier
                                                .height(32.dp)
                                                .width(32.dp)
                                                //mengatur agar icon menjadi vertical dan tengah
                                                .align(Alignment.CenterVertically)
                                        )
                                        //menambahkan konten menjadi vertical
                                        Column(
                                            modifier = Modifier.padding(
                                                horizontal = 16.dp,
                                                vertical = 8.dp
                                            )
                                        ) {
                                            Text(
                                                text = "Catatan Penelitian dan\nPembimbingan",
                                                fontSize = 20.sp,
                                                color = Color.Black
                                            )
                                            Text(
                                                text = "Anda belum memiliki catatan",
                                                fontSize = 16.sp,
                                                color = Color.Gray
                                            )

                                        }
                                    }

                                }


                            }


                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        //tugas akhir saya
                        Column(modifier = Modifier.padding(32.dp)) {

                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .shadow(
                                        elevation = 2.dp,
                                        shape = RoundedCornerShape(16.dp),
                                    ),
                            ) {
                                // Konten lainnya
                                Column {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .background(Color(0xff2B67D9))
                                    ) {
                                        Column(
                                            modifier = Modifier.padding(
                                                horizontal = 16.dp,
                                                vertical = 8.dp
                                            )
                                        ) {
                                            Text(
                                                text = "Tugas Akhir Saya",
                                                fontSize = 24.sp,
                                                color = Color.White
                                            )
                                            Text(
                                                text = "Status ajukan tugas terakhir anda",
                                                fontSize = 16.sp,
                                                color = Color.White
                                            )
                                        }

                                    }
                                    Row(modifier = Modifier.padding(16.dp)) {
                                        Icon(
                                            Icons.Outlined.Add, "Person", modifier = Modifier
                                                .height(32.dp)
                                                .width(32.dp)
                                                .align(Alignment.CenterVertically)
                                        )
                                        Column(
                                            modifier = Modifier.padding(
                                                horizontal = 16.dp,
                                                vertical = 8.dp
                                            )
                                        ) {
                                            Text(
                                                text = "Buat Usulan",
                                                fontSize = 20.sp,
                                                color = Color.Black
                                            )
                                            Text(
                                                text = "Buat usulan baru",
                                                fontSize = 16.sp,
                                                color = Color.Gray
                                            )

                                        }
                                    }

                                    Spacer(modifier = Modifier.height(2.dp))
                                    //Memanggil image dari drawable sebagai variabel
                                    val painter: Painter =
                                        painterResource(id = R.drawable.dictionary)

                                    //Membuat konten agar child yang berada didalamnya dapat berada pada posisi horizontal
                                    Row(modifier = Modifier.padding(16.dp)) {
                                        Image(
                                            //memanggil data image yang telah didefinisikan
                                            painter, "Person", modifier = Modifier
                                                .height(32.dp)
                                                .width(32.dp)
                                                .align(Alignment.CenterVertically)
                                        )
                                        Column(
                                            modifier = Modifier.padding(
                                                horizontal = 16.dp,
                                                vertical = 8.dp
                                            )
                                        ) {
                                            Text(
                                                text = "RANCAN BANGUN APLIKASI  XXXXXXXXXXXXXX XXXXXXXXXXXX \nXXXXXXXXXXXXXXXX XXXXXXXXXXXXXX \nXXXXXX DAN XXXXXX-XXXXXX",
                                                fontSize = 20.sp,
                                                color = Color.Black
                                            )
                                            Text(
                                                text = "Laboratorium XXXXXXXXXXXXXX XXXXXXXXXXX XXXXXX",
                                                fontSize = 16.sp,
                                                color = Color.Gray
                                            )
                                            Text(
                                                text = "Dosen pembimbing 1 : XXXXXXXXXXXX S.Kom., M.T.",
                                                fontSize = 16.sp,
                                                color = Color.Gray
                                            )
                                            Text(
                                                text = "Dosen pembimbing 2 : XXXXXXXXXXXX Dr.Ir. Xxxx Xxxxx S.Kom., M.Sc.",
                                                fontSize = 16.sp,
                                                color = Color.Gray
                                            )
                                            //Membuat box/container dengan custom warna menjadi biru serta menambahkan rounded pada tiap tepi box
                                            Box(
                                                modifier = Modifier
                                                    .wrapContentSize()
                                                    .background(Color(0xff83C6E7))
                                                    .shadow(
                                                        elevation = 2.dp,
                                                        shape = RoundedCornerShape(16.dp),
                                                    ).padding(4.dp),
                                            ) {
                                                //Menamahkan teks dalam pengerjaan dan color blue
                                                Text(
                                                    text = "Dalam pengerjaan",
                                                    fontSize = 12.sp,
                                                    color = Color.Blue
                                                )
                                            }
                                        }
                                    }
                                }

                            }


                        }

                        //memanggil image yang berada di drawble dan menjadikannya sebagai variabel agar dapat digunakan oleh  Image
                        val drawableResId = R.drawable.its
                        val painter: Painter = painterResource(id = drawableResId)
                        Spacer(modifier = Modifier.height(24.dp))
                        Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                            //Teks ITS
                            Text(
                                text = "© 2021-2024 Institut Teknologi Sepuluh November",
                                modifier = Modifier.align(Alignment.CenterHorizontally),
                            )
                            //Membuat logo dengan variabel yang telah dipanggil/didefinisikan sebelumnya
                            Image(
                                painter = painter, //logo yang telah didefinisikan
                                modifier = Modifier.align(Alignment.CenterHorizontally),
                                contentDescription = null // Set a proper content description if needed
                            )
                        }


                    }
                }
            }
        }
    }

}

