package com.example.arisht.cubewallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ARISHT on 13-12-2016.
 */

public class WallDBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "Wallpapers"; // the name of our database
    private static final int DB_VERSION = 1; // the version of the database

    WallDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE WALLPAPER(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"NAME TEXT, "
                + "IMAGE INTEGER NOT NULL, "
                + "TYPE TEXT NOT NULL)");



////////////Anime
        ins(db, "http://wallpaperscraft.com/image/guy_anime_computer_tears_sadness_room_96990_1080x1920.jpg", R.drawable.at1, "1");
        ins(db, "http://i3.wallpaperscraft.com/image/madara_uchiha_naruto_anime_obito_tobi_akatsuki_naruto_madara_naruto_tobi_obito_uzumaki_naruto_hashirama_senju_98921_1080x1920.jpg", R.drawable.at2, "1");
        ins(db, "http://i3.wallpaperscraft.com/image/madara_uchiha_uchiha_madara_naruto_anime_naruto_madara_95530_1080x1920.jpg", R.drawable.at3, "1");
        ins(db, "http://wallpaperscraft.com/image/anime_to_love_ru_to_love_ru_darkness_love_troubles_momo_velia_deviluke_nana_asta_deviluke_golden_darkness_kurosaki_mea_maids_inventory_cleaning_corridor_eyes_fun_93985_1080x1920.jpg", R.drawable.at4, "1");
        ins(db, "http://wallpaperscraft.com/image/vocaloid_ia_girl_style_jersey_emotion_101963_1080x1920.jpg", R.drawable.at5, "1");

        ins(db, "http://wallpaperscraft.com/image/anime_girl_kimono_fish_art_butterfly_108680_1080x1920.jpg", R.drawable.at6, "1");
        ins(db, "http://wallpaperscraft.com/image/naruto_uzumaki_naruto_hyuuga_hinata_girl_boy_kiss_101088_1080x1920.jpg", R.drawable.at7, "1");
        ins(db, "http://i3.wallpaperscraft.com/image/kuroko_no_basket_team_akashi_seijuurou_aomine_daiki_kise_ryouta_kuroko_tetsuya_midorima_shintarou_murasakibara_atsushi_99589_1080x1920.jpg", R.drawable.at8, "1");
        ins(db, "http://wallpaperscraft.com/image/ponyo_girl_kimono_flowers_aquarium_fish_100085_1080x1920.jpg", R.drawable.at9, "1");
        ins(db, "http://wallpaperscraft.com/image/nishimata_aoi_kimono_girl_fan_chrysanthemum_106770_1080x1920.jpg", R.drawable.at10, "1");

        ins(db, "http://wallpaperscraft.com/image/tachikawa_mushimaro_bimo_shingeki_no_bahamu_102034_1080x1920.jpg", R.drawable.at11, "1");
        ins(db, "http://wallpaperscraft.com/image/vocaloid_yomi_yasou_girl_hatsune_miku_100719_1080x1920.jpg", R.drawable.at12, "1");
        ins(db, "http://wallpaperscraft.com/image/final_fantasy_wig_girl_costume_82382_1080x1920.jpg", R.drawable.at13, "1");
        ins(db, "http://wallpaperscraft.com/image/vocaloid_hatsune_miku_kimono_cherry_umbrella_104721_1080x1920.jpg", R.drawable.at14, "1");
        ins(db, "http://wallpaperscraft.com/image/girl_anime_automaton_guns_uniforms_108436_1080x1920.jpg", R.drawable.at15, "1");

        ins(db, "http://i3.wallpaperscraft.com/image/art_hanabi_rin_anime_naruto_uzumaki_naruto_haruno_sakura_girl_man_night_moon_trees_cherry_93336_1080x1920.jpg", R.drawable.at16, "1");
        ins(db, "http://wallpaperscraft.com/image/ruby_rwby_anime_drawing_cape_97228_1080x1920.jpg", R.drawable.at17, "1");
        ins(db, "http://i3.wallpaperscraft.com/image/jiraiya_linnyxito_smile_art_man_look_93705_1080x1920.jpg", R.drawable.at18, "1");
        ins(db, "http://wallpaperscraft.com/image/moscyan_danganronpa_kirigiri_kyouko_anime_art_98543_1080x1920.jpg", R.drawable.at19, "1");
        ins(db, "http://i3.wallpaperscraft.com/image/future_diary_mirai_nikki_yukiteru_amano_yuno_gasai_112134_1080x1920.jpg", R.drawable.at20, "1");

        ins(db, "http://i3.wallpaperscraft.com/image/princess_mononoke_hayao_miyazaki_wolf_108107_1080x1920.jpg", R.drawable.at21, "1");
        ins(db, "http://wallpaperscraft.com/image/bleach_ichigo_kurosaki_shinigami_grimmjow_jaegerjaquez_105551_1080x1920.jpg", R.drawable.at22, "1");
        ins(db, "http://wallpaperscraft.com/image/luna_selenium_mikasa_ackerman_shingeki_no_kyojin_view_weapon_sword_102813_1080x1920.jpg", R.drawable.at23, "1");
        ins(db, "http://wallpaperscraft.com/image/bouno_satoshi_girl_art_face_flowers_99572_1080x1920.jpg", R.drawable.at24, "1");
        ins(db, "http://wallpaperscraft.com/image/siji_vocaloid_hatsune_miku_station_train_girl_snow_99127_1080x1920.jpg", R.drawable.at25, "1");

      /*  ins(db, "http://drwallpaper.com/wp-content/uploads/2016/01/attack_on_titan__wallpaper_hd_background_download_mobile_iphone_6s_galaxy.png", R.drawable.a26, "1");
        ins(db, "https://s-media-cache-ak0.pinimg.com/236x/46/70/7b/46707bb0f3bada041b9c908ddd53e1de.jpg", R.drawable.a27, "1");
        ins(db, "http://www.wallpapervortex.com/mobile_phone_wallpapers/mobile_phone_wallpaper_46220_attack_on_titan.jpg", R.drawable.a28, "1");
        ins(db, "http://www.animehdwallpapers.net/downloads/AckermanMikasa-androidwallpaper.png", R.drawable.a29, "1");
        ins(db, "https://wallpaperscraft.com/image/death_note_l_lawliet_l_detective_103315_640x1136.jpg", R.drawable.a30, "1");

        ins(db, "https://mfiles.alphacoders.com/654/65494.jpg", R.drawable.a31, "1");
        ins(db, "http://www.wallpapervortex.com/mobile_phone_wallpapers/mobile_phone_wallpaper_27489_bleach.jpg", R.drawable.a32, "1");
        ins(db, "https://s-media-cache-ak0.pinimg.com/236x/23/9c/e5/239ce59769ef63a3f5048b59446b3aef.jpg", R.drawable.a33, "1");
        ins(db, "http://wallpaperformobile.org/wp-content/uploads/2016/03/dragon-ball-z-phone-wallpaper.jpg", R.drawable.a34, "1");
        ins(db, "imgur.com/7HxpaEB.jpg", R.drawable.a35, "1");

        ins(db, "http://drwallpaper.com/wp-content/uploads/2016/01/one_piece_wallpaper_hd_download_mobile_iphone_6s_galaxy.jpg", R.drawable.a36, "1");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/freewallpaper/129635220206450-24306.jpg", R.drawable.a37, "1");
        ins(db, "https://mfiles.alphacoders.com/515/515007.jpg", R.drawable.a38, "1");
        ins(db, "https://s-media-cache-ak0.pinimg.com/736x/56/57/94/5657945e3ce5b7ee66923ddc52948f3c.jpg", R.drawable.a39, "1");
        ins(db, "https://s-media-cache-ak0.pinimg.com/564x/4f/b9/a8/4fb9a810ed71002b4bfd9d4e55ac3f07.jpg", R.drawable.a40, "1");

        ins(db, "https://s-media-cache-ak0.pinimg.com/736x/f8/c5/69/f8c5699d2e4c19a591c88dd8cfc5647f.jpg", R.drawable.a41, "1");
        ins(db, "http://kawaii-mobile.com/2014/04/golden-time/golden-time-kaga-koko-tada-banri-yanagisawa-mitsuo-sony-xperia-z-wallpaper-1080x1920/custom/kawaii-mobile.com.Golden-Time.Kaga-Koko.Tada-Banri.Yanagisawa-Mitsuo-Sony-Xperia-Z-wallpaper.720x1280.jpg?newsize=720x1280&id=10303", R.drawable.a42, "1");
        ins(db, "https://mfiles.alphacoders.com/582/582128.jpg", R.drawable.a43, "1");
        ins(db, "https://s-media-cache-ak0.pinimg.com/564x/4d/a6/cf/4da6cf670b665f0b4d439468e1df6e0b.jpg", R.drawable.a44, "1");
        ins(db, "http://www.wallpapervortex.com/mobile_phone_wallpapers/mobile_phone_wallpaper_57146_hunter_x_hunter.jpg", R.drawable.a45, "1");

        ins(db, "https://mfiles.alphacoders.com/224/224066.jpg", R.drawable.a46, "1");
        ins(db, "https://s-media-cache-ak0.pinimg.com/originals/1e/bf/54/1ebf54097d81652557258da8fb53205d.jpg", R.drawable.a47, "1");
        ins(db, "https://mfiles.alphacoders.com/614/614106.jpg", R.drawable.a48, "1");
        ins(db, "http://www.wallpapervortex.com/mobile_phone_wallpapers/mobile_phone_wallpaper_36228_fullmetal_alchemist_fullmetal_alchemist_brotherhood.jpg", R.drawable.a49, "1");
        ins(db, "https://mfiles.alphacoders.com/157/1574.jpg", R.drawable.a50, "1");*/


//////////////superhero

        ins(db, "https://wallpaperscraft.com/image/deadpool_marvel_comics_superhero_107251_1080x1920.jpg", R.drawable.st1, "2");
        ins(db, "http://files.vividscreen.info/soft/24384925a0f0c9d13ce1ffec7a29c540/Batman-1080x1920.jpg", R.drawable.st2, "2");
        ins(db, "https://wallpaperscraft.com/image/batman_arkham_knight_bruce_wayne_armor_hologram_107565_2160x3840.jpg", R.drawable.st3, "2");
        ins(db, "https://wallpaperscraft.com/image/justice_league_superman_aquaman_arrow_batman_flash_green_arrow_green_lantern_104249_2160x3840.jpg", R.drawable.st4, "2");
        ins(db, "https://wallpaperscraft.com/image/batman_arkham_knight_art_104239_2160x3840.jpg", R.drawable.st5, "2");

        ins(db, "http://spliffmobile.com/download/suicide-squad-joker-6698.jpg", R.drawable.st6, "2");
        ins(db, "http://sherly.mobile9.com/download/media/656/funny-joke_ad0i81OM.jpg", R.drawable.st7, "2");
        ins(db, "http://www.poppriceguide.com/wp-content/uploads/2016/01/Joker-wallpaper-10673484.jpg", R.drawable.st8, "2");
        ins(db, "http://www.greathdwallpapers.com/wallpapers/the_avengers_iron_man-1080x1920.jpg", R.drawable.st9, "2");
        ins(db, "http://m.androidwallpapercentral.com/downloads/2xIronman-androidwallpapers.jpg", R.drawable.st10, "2");

        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/iphone-6s-wallpaper-1-1440x2560/iphone-6s-wallpaper-HD-376mc5ka-1440x2560.jpg", R.drawable.st11, "2");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/iphone-6s-wallpaper-1-1440x2560/iphone-6s-wallpaper-HD-1616stkhe-1440x2560.jpg", R.drawable.st12, "2");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/iphone-6s-wallpaper-1-1440x2560/iphone-6s-wallpaper-HD-2000gh3np-1440x2560.jpg", R.drawable.st13, "2");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/1440x2560-1/1440x2560-samsung-htc-lg-mobile-hd-wallpapers-35904z3mu.jpg", R.drawable.st14, "2");
        ins(db, "http://i.imgur.com/A755ZPz.jpg", R.drawable.st15, "2");

        ins(db, "http://www.lgg3wallpaper.com/wp-content/uploads/Movie/Robocop%202014%2002%20LG%20G3%20Wallpapers.jpg", R.drawable.st16, "2");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1242x2208/1242x2208-superhero_xmen_comic_wolverine_comics-23246.jpg", R.drawable.st17, "2");
        ins(db, "https://s-media-cache-ak0.pinimg.com/564x/4e/af/82/4eaf82346574d0e93f7223ab0de2e3d3.jpg", R.drawable.st18, "2");
        ins(db, "http://more-sky.com/data/out/6/IMG_89046.jpg", R.drawable.st19, "2");
        ins(db, "http://www.wallpapervortex.com/mobile_phone_wallpapers/mobile_phone_wallpaper_43024_comics_dc_comics_dc_superheroes.jpg", R.drawable.st20, "2");

        ins(db, "http://i.imgur.com/2GhOHk3.png", R.drawable.st21, "2");
        ins(db, "http://www.iphonehdwallpapers.net/wp-content/cache/201288d04115446e4607523a159eb0dd_w324_h576_sc.jpg", R.drawable.st22, "2");
        ins(db, "http://thewallpaper.co/wp-content/uploads/2016/02/medieval-captain-americfantasy-mobile-wallpaper-x-super-hero-shield-1080x1920.jpg", R.drawable.st23, "2");
        ins(db, "http://i.imgur.com/z5cSNXV.jpg", R.drawable.st24, "2");
        ins(db, "http://media.idownloadblog.com/wp-content/uploads/2016/10/doctor_strange_movie-750x1334.jpg", R.drawable.st25, "2");

        ins(db, "http://i.imgur.com/yOzybq7.jpg", R.drawable.st26, "2");
        ins(db, "http://theiphonewalls.com/wp-content/uploads/2013/11/Wolverine-Every-Damn-Time.jpg", R.drawable.st27, "2");
        ins(db, "http://cdn.wallpapersafari.com/44/42/DXejgL.jpg", R.drawable.st28, "2");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1242x2208/1242x2208-superhero_xmen_comic_wolverine_comics-23246.jpg", R.drawable.st29, "2");
        ins(db, "http://www.fiz-x.com/wp-content/uploads/2015/07/Spider-Logo-1080x1920.jpg", R.drawable.st30, "2");

        ins(db, "http://hdphonewallpapers.com/content/ifxOtbBO3BURMEk4i2DGNFTvCNG959qvgZa4uGSpUpqfFwOWaqmNmbXcMCMgVCT4.png", R.drawable.st31, "2");
        ins(db, "http://i.imgur.com/KTmVEce.jpg", R.drawable.st32, "2");
        ins(db, "http://androidwalls.net/wp-content/uploads/2014/09/Batman%20Superhero%20Illustration%20Android%20Wallpaper.jpg", R.drawable.st33, "2");
        ins(db, "http://cdn.wallpapersafari.com/14/97/a1JETi.jpg", R.drawable.st34, "2");
        ins(db, "http://www.wallpapermaiden.com/wallpaper/8689/download/1080x1920/hulk-explosion-marvel-superhero.jpg", R.drawable.st35, "2");

        ins(db, "http://www.fiz-x.com/wp-content/uploads/2015/07/Batman-Vs-Superman-1080x1920.jpg", R.drawable.st36, "2");
        ins(db, "http://www.worldsofawesome.com/wp-content/uploads/2015/07/SuperheroWallpaper-48.jpg", R.drawable.st37, "2");
        ins(db, "https://mfiles.alphacoders.com/602/602647.jpg", R.drawable.st38, "2");
        ins(db, "http://www.wallpapervortex.com/mobile_phone_wallpapers/mobile_phone_wallpaper_50899_comics_iron_man.jpg", R.drawable.st39, "2");
        ins(db, "https://lh3.googleusercontent.com/-z36-glloeJs/VhpotR4mw_I/AAAAAAAAQhQ/wtmvoSbeEtQ/w1080-h1920/Iron_Man-wallpaper-10652176.jpg", R.drawable.st40, "2");

        ins(db, "https://mfiles.alphacoders.com/601/601696.jpg", R.drawable.st41, "2");
        ins(db, "https://s-media-cache-ak0.pinimg.com/originals/b2/32/12/b23212f6d214d2a3e94bda5fc8a6643d.jpg", R.drawable.st42, "2");
        ins(db, "https://s-media-cache-ak0.pinimg.com/564x/2f/8d/a1/2f8da1869b821463120286795d0a8554.jpg", R.drawable.st43, "2");
        ins(db, "https://s-media-cache-ak0.pinimg.com/736x/4f/c8/c9/4fc8c9d8deb7ae4c61f6b68b437674cb.jpg", R.drawable.st44, "2");
        ins(db, "https://s-media-cache-ak0.pinimg.com/736x/06/a0/8f/06a08ff92a9259e58d6eaf927e8c3401.jpg", R.drawable.st45, "2");

        ins(db, "https://s-media-cache-ak0.pinimg.com/564x/59/bf/8d/59bf8df3d3c921a61d6829ae9d239eab.jpg", R.drawable.st46, "2");
        ins(db, "http://wallpaperscraft.com/image/avengers_2_robert_downey_jr_iron_man_tony_stark_chris_evans_captain_america_steve_rogers_chris_hemsworth_102095_1080x1920.jpg", R.drawable.st47, "2");
        ins(db, "http://wallpaperscraft.com/image/black_widow_avengers_age_of_ultron_scarlett_johansson_103478_1080x1920.jpg", R.drawable.st48, "2");
        ins(db, "http://wallpaperscraft.com/image/the_avengers_2012_thor_chris_hemsworth_99905_1080x1920.jpg", R.drawable.st49, "2");
        ins(db, "http://i.imgur.com/jOTCyIy.jpg", R.drawable.st50, "2");





////////////////Game



        ins(db, "https://wallpaperscraft.com/image/mortal_kombat_x_scorpio_ninja_mask_96591_1440x2560.jpg", R.drawable.gt1, "3");
        ins(db, "http://www.note4wallpaper.com/wp-content/uploads/Games/Games%20Samsung%20Galaxy%20Note%204%20Wallpapers%20118.jpg", R.drawable.gt2, "3");
        ins(db, "http://www.samsunggalaxys5wallpaper.com/wp-content/uploads/Games/Games%20Galaxy%20S5%20Wallpapers%20HD%20134.jpg", R.drawable.gt3, "3");
        ins(db, "http://www.note4wallpaper.com/wp-content/uploads/Games/Games%20Samsung%20Galaxy%20Note%204%20Wallpapers%20106.jpg", R.drawable.gt4, "3");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1440x2560/1440x2560-hitman_suits_black_background_hitman_absolution_red_tie_tie_white_clothing_video_games-21415.jpg", R.drawable.gt5, "3");

        ins(db, "https://wallpaperscraft.com/image/battlefield_aviation_ammunition_skull_gun_fire_16291_2160x3840.jpg", R.drawable.gt6, "3");
        ins(db, "https://wallpaperscraft.com/image/watch_dogs_aiden_pearce_game_2014_92926_1440x2560.jpg", R.drawable.gt7, "3");
        ins(db, "http://wallpaperscraft.com/image/the_dark_slayer_the_son_of_sparda_devil_may_cry_109490_1440x2560.jpg", R.drawable.gt8, "3");
        ins(db, "http://i3.wallpaperscraft.com/image/the_witcher_3_wild_hunt_hearts_of_stone_105826_1440x2560.jpg", R.drawable.gt9, "3");
        ins(db, "http://i3.wallpaperscraft.com/image/call_of_duty_black_ops_2_art_zombie_106412_1440x2560.jpg", R.drawable.gt10, "3");

        ins(db, "http://wallpaperscraft.com/image/lord_of_the_rings_art_guardians_of_middle_earth_eowyn_97079_1440x2560.jpg", R.drawable.gt11, "3");
        ins(db, "http://i3.wallpaperscraft.com/image/rainbow_6_patriots_tom_clancys_soldiers_weapons_shootout_ubisoft_95541_1440x2560.jpg", R.drawable.gt12, "3");
        ins(db, "http://wallpaperscraft.com/image/tomb_raider_reborn_lara_croft_boom_girl_105249_1440x2560.jpg", R.drawable.gt13, "3");
        ins(db, "https://4.bp.blogspot.com/-Fb1GXmbvN7o/UxIq75aUmhI/AAAAAAAAoTA/j9pknfgDPJE/s0/Assassin%2527s+Creed+IV+Black+Flag_1080x1920.jpg", R.drawable.gt14, "3");
        ins(db, "https://wallpaperscraft.com/image/kratos_god_of_war_face_eyes_scar_2181_1080x1920.jpg", R.drawable.gt15, "3");

        ins(db, "https://mfiles.alphacoders.com/636/636312.jpg", R.drawable.gt16, "3");
        ins(db, "http://hdqwalls.com/download/battlefield-1-5k-hd-pic-1080x1920.jpg", R.drawable.gt17, "3");
        ins(db, "https://mfiles.alphacoders.com/644/644842.jpg", R.drawable.gt18, "3");
        ins(db, "http://www.gratistodo.com/wp-content/uploads/2016/09/Forza-Horizon-3-Movil-Wallpapers-2.jpg", R.drawable.gt19, "3");
        ins(db, "http://www.gratistodo.com/wp-content/uploads/2016/09/Forza-Horizon-3-Movil-Wallpapers-4.jpg", R.drawable.gt20, "3");

        ins(db, "http://www.gratistodo.com/wp-content/uploads/2016/09/Forza-Horizon-3-Movil-Wallpapers-1.jpg", R.drawable.gt21, "3");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1440x2560/1440x2560-crysis_3_cgi_video_games_crysis-4297.jpg", R.drawable.gt22, "3");
        ins(db, "http://cdn4.dualshockers.com/wp-content/uploads/2015/05/Android_1440x2560_Jacob.jpg", R.drawable.gt23, "3");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1440x2560/1440x2560-vaas_far_cry-30712.jpg", R.drawable.gt24, "3");
        ins(db, "https://wallpaperscraft.com/image/far_cry_primal_action_adventure_ubisoft_montreal_106127_1440x2560.jpg", R.drawable.gt25, "3");

        ins(db, "http://htc-wallpaper.com/wp-content/uploads/2015/01/Watch-Dogs-Connection-Is-Power-Game.jpg?982602", R.drawable.gt26, "3");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1080x1920/1080x1920-assassins_creed_black_flag_video_games-7720.jpg", R.drawable.gt27, "3");
        ins(db, "https://s-media-cache-ak0.pinimg.com/736x/bc/fe/dc/bcfedc9b79f43531a3f83fe492ab5148.jpg", R.drawable.gt28, "3");
        ins(db, "http://www.hdiphonewallpaper.com/uploads/image/iPhone%206%20Wallpapers/Games/Call%20of%20Duty%2001%20Games%201080x1920.jpg", R.drawable.gt29, "3");
        ins(db, "https://i3.wallpaperscraft.com/image/syndicate_ea_eurocorp_shuter_103585_1080x1920.jpg", R.drawable.gt30, "3");

        ins(db, "http://www.pixelstalk.net/wp-content/uploads/2016/06/Game-Pokemon-iPhone-Wallpaper-349x620.jpg", R.drawable.gt31, "3");
        ins(db, "http://htc-wallpaper.com/wp-content/uploads/2014/04/Dead-Space-game.jpg?982602", R.drawable.gt32, "3");
        ins(db, "https://wallpaperscraft.com/image/pokemon_go_pokemon_raichu_110524_1080x1920.jpg", R.drawable.gt33, "3");
        ins(db, "http://www.techagesite.com/pokemon/cool-pokemon-go-mobile-wallpapers-pokeball-fire-hd-.jpg", R.drawable.gt34, "3");
        ins(db, "https://wallpaperscraft.com/image/pokemon_go_pokeball_ball_game_110569_1080x1920.jpg", R.drawable.gt35, "3");

        ins(db, "http://www.wallpapersforgalaxys6.com/wp-content/uploads/Games/GTA%205%20wallpapers%20for%20galaxy%20S6.jpg", R.drawable.gt36, "3");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/1440x2560-1/1440x2560-samsung-htc-lg-mobile-hd-wallpapers-5892w752t.jpg", R.drawable.gt37, "3");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1440x2560/1440x2560-video_games_ezio_auditore_da_firenze_assassins_creed-10231.jpg", R.drawable.gt38, "3");
        ins(db, "http://www.lgg4wallpaper.com/wp-content/uploads/Games/Game%20Icons%20LG%20G4%20Wallpaper.jpg", R.drawable.gt39, "3");
        ins(db, "https://wallpaperscraft.com/image/hitman_pistols_bald_suit_agent_47_21941_1440x2560.jpg", R.drawable.gt40, "3");

        ins(db, "https://wallpaperscraft.com/image/battlefield_4_soldiers_equipment_helmet_art_109362_1440x2560.jpg", R.drawable.gt41, "3");
        ins(db, "https://wallpaperscraft.com/image/battlefield_4_guns_soldiers_equipment_109376_1440x2560.jpg", R.drawable.gt42, "3");
        ins(db, "http://www.ilikewallpaper.net/iphone-6-wallpapers/download/28369/Assassins-Creed-4-Dark-Game-Art-Illust-iphone-6-wallpaper-ilikewallpaper_com.jpg", R.drawable.gt43, "3");
        ins(db, "https://wallpaperscraft.com/image/battlefield_4_game_ea_digital_illusions_ce_93159_750x1334.jpg", R.drawable.gt44, "3");
        ins(db, "http://www.wallpapersforiphone6plus.com/wp-content/uploads/Design/Creative%20game%20characters%20iPhone%206%20plus%20Wallpapers.jpg", R.drawable.gt45, "3");


        ins(db, "https://wallpaperscraft.com/image/mortal_kombat_sub_zero_video_game_93728_750x1334.jpg", R.drawable.gt46, "3");
        ins(db, "https://wallpapers.pub/web/wallpapers/assassins-creed-iv-black-flag-video-game/1080x1920.jpg", R.drawable.gt47, "3");
        ins(db, "http://www.hdiphone6pluswallpaper.com/wp-content/uploads/Games/Games%20iPhone%206%20Plus%20Wallpaper%2035.jpg", R.drawable.gt48, "3");
        ins(db, "https://wallpapers.pub/web/wallpapers/devil-may-cry-4-the-game-wallpaper/1080x1920.jpg", R.drawable.gt49, "3");
        ins(db, "http://files.vividscreen.info/soft/8ba6a474f720f5418eaf35231b091d54/Mirror-s-Edge-Video-Game-1080x1920.jpg", R.drawable.gt50, "3");



        ////////////vectors

        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/13110/Tv-vector-art-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v1, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/7049/Axolotls-Vector-Art-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v1, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/15419/Dark-vector-art-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v1, "4");
        ins(db, "https://s-media-cache-ak0.pinimg.com/736x/71/4f/24/714f248af34f21e5fe0ea17acc538d58.jpg", R.drawable.v1, "4");
        ins(db, "http://www.idesigniphone.net/wallpapers/53564.png", R.drawable.v1, "4");

        ins(db, "http://dailyiphoneblog.com/wp-content/uploads/2013/12/iphone-5-wallpapers-1721.jpg", R.drawable.v1, "4");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/iphone-6s-wallpaper-1-1080x1920/iphone-6s-wallpaper-HD-20027vzic-1080x1920.jpg", R.drawable.v1, "4");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1242x2208/1242x2208-black_thoughts_man_thought_vector-14991.jpg", R.drawable.v1, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/10327/Zodiac-vector-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v1, "4");
        ins(db, "http://www.iphone6-wallpapers.com/wp-content/uploads/City/City%20Vector%20iPhone%206%20Wallpapers.jpg", R.drawable.v1, "4");

        ins(db, "http://www.iphone5wallpapershd.us/iphone-5-backgrounds/iphone-5-wallpapers/iphone-5-wallpapers-hd-3172-48jfo.jpg", R.drawable.v11, "4");
        ins(db, "https://i3.wallpaperscraft.com/image/anonymous_blood_mask_vector_splashes_97368_750x1334.jpg", R.drawable.v12, "4");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/iphone-4-wallpapers/ipod-touch-iphone-wallpapers-286ios.jpg", R.drawable.v13, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/11389/Blue-Vector-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v14, "4");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1242x2208/1242x2208-vector_circle_waves_circle_wave-12327.jpg", R.drawable.v15, "4");

        ins(db, "https://wallpaperscraft.com/image/the_last_of_us_naughty_dog_sony_computer_entertainment_vector_100067_750x1334.jpg", R.drawable.v16, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-4s-wallpapers/download/19942/Pretend-Its-Okay-Vector-iphone-4s-parallax-wallpaper-ilikewallpaper_com.jpg", R.drawable.v17, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/18513/Snowflakes-Vector-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v18, "4");
        ins(db, "http://www.7diphone.com/wp-content/uploads/Abstract/1136-2/Vector%20City-640x1136%20wallpapers.jpg", R.drawable.v19, "4");
        ins(db, "http://www.hdiphonewallpapers.us/phone-wallpapers/iphone-5-wallpapers/iphone-5-wallpapers-hd-124.jpg", R.drawable.v20, "4");

        ins(db, "http://www.7diphone.com/wp-content/uploads/Cartoons/1136/Ironman%20Vector%20HD-640x1136%20wallpapers.jpg", R.drawable.v21, "4");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1242x2208/1242x2208-artistic_vector-11462.jpg", R.drawable.v22, "4");
        ins(db, "http://www.7diphone.com/wp-content/uploads/Abstract/1136/Abstract%20Vector%20Skulls-640x1136%20wallpapers.jpg", R.drawable.v23, "4");
        ins(db, "http://www.iphone5wallpapershd.us/iphone-5-backgrounds/iphone-5-wallpaper/iphone-5-wallpapers-hd-3496-xteb8.jpg", R.drawable.v24, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/19669/Pastel-Polygon-Vector-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v25, "4");

        ins(db, "http://www.iphone6walls.com/wp-content/uploads/Abstract/Vector%20abstract%20iPhone%206%20Wallpapers.jpg", R.drawable.v26, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/13114/Beautiful-vector-flowers-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v27, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/19735/Blue-Polygon-Vector-HD-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v28, "4");
        ins(db, "http://3.bp.blogspot.com/-Es-mwhiMH_s/VBZQDog8h3I/AAAAAAAABrI/y5eqPQgbBnA/s1600/blue-vector-iphone-6-plus-wallpaper-tree.jpg", R.drawable.v29, "4");
        ins(db, "https://wallpaperscraft.com/image/girl_face_mask_sad_graphic_vector_57117_750x1334.jpg", R.drawable.v30, "4");

        ins(db, "http://www.iphone5wallpapershd.us/iphone-5-backgrounds/iphone-5-wallpapers/iphone-5-wallpapers-hd-1564-mqo0m.jpg", R.drawable.v31, "4");
        ins(db, "http://apple.wallpapersfine.com/wallpapers/original/1242x2208/w-6296.jpg", R.drawable.v32, "4");
        ins(db, "http://www.pixelstalk.net/wp-content/uploads/2016/10/Backgrounds-Abstract-iPhone-Images.jpg", R.drawable.v33, "4");
        ins(db, "https://i3.wallpaperscraft.com/image/vinyl_record_music_vector_heap_80083_750x1334.jpg", R.drawable.v34, "4");
        ins(db, "http://www.topiphone5wallpapers.com/wp-content/uploads/Design/Vector%20beauty.jpg", R.drawable.v35, "4");

        ins(db, "https://wallpaperscraft.com/image/art_vector_tree_cat_bird_minimalism_97437_640x1136.jpg", R.drawable.v36, "4");
        ins(db, "http://iphonewalls.net/wp-content/uploads/2014/09/Abstract%20Vector%20Lights%20iPhone%206%20Plus%20HD%20Wallpaper.jpg", R.drawable.v37, "4");
        ins(db, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQex_qx0ACHsOAG62fskMxzrxbLQTqH9pFmihUxO8cRhSut4RZB", R.drawable.v38, "4");
        ins(db, "http://hdphonewallpapers.com/content/Asgyo9LoE7viXi37bFySwfhCaNnuCC6UdBcQ3oTJlw2vZD6rrt5esOrdLeXbVZmB.jpg", R.drawable.v39, "4");
        ins(db, "http://more-sky.com/data/out/9/IMG_295535.jpg", R.drawable.vt40, "4");

        ins(db, "http://www.ilikewallpaper.net/iphone-5s-wallpapers/download/17526/Vector-Purple-Leaves-Flowers-iphone-5s-wallpaper-ilikewallpaper_com.jpg", R.drawable.v41, "4");
        ins(db, "http://www.wallpapersforiphone6plus.com/wp-content/uploads/Abstract/Vector%20abstract%20wallpapers%20for%20iphone%206%20plus.jpg", R.drawable.v42, "4");
        ins(db, "http://www.ilikewallpaper.net/iphone-5-wallpapers/download/11420/Mine-craft-diamonds-iphone-5-wallpaper-ilikewallpaper_com.jpg", R.drawable.v43, "4");
        ins(db, "https://wallpaperscraft.com/image/joker_card_vector_23773_750x1334.jp", R.drawable.v44, "4");
        ins(db, "http://www.hdiphonewallpaper.com/wp-content/uploads/Music/1080/Vector%20musical%20theme%2004%20iPhone%206%20and%206%20plus%20wallpapers.jpg", R.drawable.v45, "4");

        ins(db, "http://www.wallpapersformobilehd.com/wallpapers/abstract/triangle-background-vector-abstract-iphone-6-plus-1080x1920-wallpaper.jpg", R.drawable.v46, "4");
        ins(db, "http://www.hdiphonewallpaper.com/wp-content/uploads/Music/1080/Vector%20musical%20theme%2003%20iPhone%206%20and%206%20plus%20wallpapers.jpg", R.drawable.v47, "4");
        ins(db, "http://wallpapersonthe.net/wallpapers/b/1242x2208/1242x2208-flag_wave_bird_japan_japan_flag_art_vector-20094.jpg", R.drawable.v48, "4");
        ins(db, "http://4.bp.blogspot.com/-S3qreDXov8w/VCzI8yOrChI/AAAAAAAABtw/WHjm3yOdJog/s1600/love-coffee-vector-iphone-6-wallpaper-background-free.png", R.drawable.v49, "4");
        ins(db, "https://wallpaperscraft.com/image/angel_wings_flower_vector_102124_750x1334.jpg", R.drawable.v50, "4");





    }

    private static void ins(SQLiteDatabase db, String name, int resourceId, String type) {
        ContentValues d = new ContentValues();
        d.put("NAME", name);
        d.put("IMAGE", resourceId);
        d.put("TYPE", type);
        db.insert("WALLPAPER", null, d);
    }




    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

}
