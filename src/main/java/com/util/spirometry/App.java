package com.util.spirometry;

import com.util.spirometry.dto.OutputDTO;
import com.util.spirometry.dto.ParamsDTO;
import com.util.spirometry.dto.SexEnum;

/**
 * Hello world!
 *
 */
public class App {
	
	static int[] WrightToEU = new int[] {51, 51, 52, 52, 52, 53, 53, 54, 54, 54, 55, 55, 56, 56, 57, 57, 57, 58, 58, 59, 59, 60, 60, 60, 61, 61, 62, 62, 63, 63, 64, 64, 65, 65, 65, 66, 66, 67, 67, 68, 68, 69, 69, 70, 70, 71, 71, 72, 72, 73, 73, 74, 74, 75, 75, 76, 76, 76, 77, 78, 78, 79, 79, 80, 80, 81, 81, 82, 82, 83, 83, 84, 84, 85, 85, 86, 86, 87, 87, 88, 88, 89, 90, 90, 91, 91, 92, 92, 93, 93, 94, 95, 95, 96, 96, 97, 97, 98, 98, 99, 100, 100, 101, 101, 102, 103, 103, 104, 104, 105, 105, 106, 107, 107, 108, 108, 109, 110, 110, 111, 111, 112, 113, 113, 114, 115, 115, 116, 116, 117, 118, 118, 119, 120, 120, 121, 121, 122, 123, 123, 124, 125, 125, 126, 127, 127, 128, 129, 129, 130, 130, 131, 132, 132, 133, 134, 134, 135, 136, 136, 137, 138, 138, 139, 140, 141, 141, 142, 143, 143, 144, 145, 145, 146, 147, 147, 148, 149, 150, 150, 151, 152, 152, 153, 154, 155, 155, 156, 157, 157, 158, 159, 160, 160, 161, 162, 163, 163, 164, 165, 165, 166, 167, 168, 168, 169, 170, 171, 171, 172, 173, 174, 174, 175, 176, 177, 178, 178, 179, 180, 181, 181, 182, 183, 184, 184, 185, 186, 187, 188, 188, 189, 190, 191, 192, 192, 193, 194, 195, 196, 196, 197, 198, 199, 200, 200, 201, 202, 203, 204, 205, 205, 206, 207, 208, 209, 209, 210, 211, 212, 213, 214, 214, 215, 216, 217, 218, 219, 220, 220, 221, 222, 223, 224, 225, 226, 226, 227, 228, 229, 230, 231, 232, 232, 233, 234, 235, 236, 237, 238, 239, 240, 240, 241, 242, 243, 244, 245, 246, 247, 248, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 389, 390, 391, 392, 393, 394, 395, 396, 398, 399, 400, 401, 402, 403, 404, 405, 407, 408, 409, 410, 411, 412, 413, 415, 416, 417, 418, 419, 420, 421, 423, 424, 425, 426, 427, 428, 430, 431, 432, 433, 434, 435, 437, 438, 439, 440, 441, 442, 444, 445, 446, 447, 448, 450, 451, 452, 453, 454, 456, 457, 458, 459, 460, 462, 463, 464, 465, 466, 468, 469, 470, 471, 472, 474, 475, 476, 477, 479, 480, 481, 482, 483, 485, 486, 487, 488, 490, 491, 492, 493, 495, 496, 497, 498, 500, 501, 502, 503, 505, 506, 507, 508, 510, 511, 512, 513, 515, 516, 517, 518, 520, 521, 522, 523, 525, 526, 527, 529, 530, 531, 532, 534, 535, 536, 538, 539, 540, 541, 543, 544, 545, 547, 548, 549, 551, 552, 553, 554, 556, 557, 558, 560, 561, 562, 564, 565, 566, 568, 569, 570, 572, 573, 574, 576, 577, 578, 580, 581, 582, 584, 585, 586, 588, 589, 590, 592, 593, 594, 596, 597, 598, 600, 601, 602, 604, 605, 606, 608, 609, 611, 612, 613, 615, 616, 617, 619, 620, 622, 623, 624, 626, 627, 628, 630, 631, 633, 634, 635, 637, 638, 640, 641, 642, 644, 645, 646, 648, 649, 651, 652, 654, 655, 656, 658, 659, 661, 662, 663, 665, 666, 668, 669, 670, 672, 673, 675, 676, 678, 679, 680, 682, 683, 685, 686, 688, 689, 690, 692, 693, 695, 696, 698, 699, 701, 702, 704, 705, 706, 708, 709, 711, 712, 714, 715, 717, 718, 720, 721, 722, 724, 725, 727, 728, 730, 731, 733, 734, 736, 737, 739, 740, 742, 743, 745, 746, 748, 749, 751, 752, 754, 755, 757, 758, 760, 761, 763, 764, 766, 767, 769, 770, 772, 773, 775, 776, 778, 779, 781, 782, 784, 785, 787, 788, 790, 791, 793, 794, 796, 798, 799, 801, 802, 804, 805, 807, 808, 810, 811, 813, 814, 816, 818, 819, 821, 822, 824, 825, 827, 828, 830, 832, 832, 835, 836, 838, 839, 841, 842, 844, 846, 847, 849, 850, 852, 854, 855, 857, 858, 860, 861, 863, 865, 866, 868, 869, 871, 873, 874, 876, 877};	
	public static void main(String[] args) {
		ParamsDTO paramsDTO=ParamsDTO.builder().sex(SexEnum.MALE).age(50).height(180d).fev1(40d).fvc(43d).pefr(720d).build();
		calc(paramsDTO);
		
		paramsDTO=ParamsDTO.builder().sex(SexEnum.FEMALE).age(50).height(180d).fev1(40d).fvc(43d).pefr(720d).build();
		calc(paramsDTO);		
	}

	
	public static double ln(double i) {
	    return Math.log(i);
	}
	public static double eTo(double x) {
	    return Math.exp(x);
	}
//	public static double notempty(double inputStr) {
//	    if (isNaN(inputStr)) {
//	        alert("Entry not a valid number");
//	    } else {
//	        if (inputStr == "" || inputStr == null || inputStr == 0) {
//	            alert("Please enter valid Age, height, FEV1 and FVC before clicking Calculate.");
//	            return false;
//	        }
//	        return true;
//	    }
	/**
	 * calc spirometry
	 * @param paramsDTO
	 */
	public static OutputDTO calc(ParamsDTO paramsDTO) {
    	
    	
        double a = paramsDTO.age;
        SexEnum sex = paramsDTO.sex;
        double height = paramsDTO.height;
        double h = paramsDTO.height / 100;
        double pefr = paramsDTO.pefr;
        double fev1 = paramsDTO.fev1;
        double fvc = paramsDTO.fvc;
        double ratio = 100 * paramsDTO.fev1 / paramsDTO.fvc;
        String  ratioValue = ratio + "%";

        double pfev1 = 0;
        double opfev1 = 0;
        double f5 = 0;
        double pratio = 0;
        double r5=0; 
        double pfvc =0 ;
        double opfvc=0;
        double v5 =0;
        double ppefr=0;
        double oppefr =0;
        double p5 = 0;
        double cpefr=0d;
        double cfev1=0d;
        double cfvc=0d;
        String cratio="";


        
        if (paramsDTO.getSex().equals(SexEnum.MALE)) {
            pfev1 = 2.081 + (0.5846 * h * h * h) - 0.01599 * a * h;
            opfev1 = pfev1;
            f5 = pfev1 - 0.798;
            pfev1 = pfev1 * 100;
            pfev1 = Math.round(pfev1);
            pfev1 = pfev1 / 100;
            pratio = 92.963 + (0.002487 * a * a) - (0.2260 * a * h);
            r5 = pratio - 7.74;
            
            pfvc = 12.675 - (0.0002764 * a * a) - (10.736 * h * h) + (4.790 * h * h * h);
            opfvc = pfvc;
            v5 = pfvc - 1.035;
            pfvc = pfvc * 100;
            pfvc = Math.round(pfvc);
            pfvc = pfvc / 100;
            ppefr = eTo((0.544 * ln(a)) - (0.0151 * a) - (74.7 / height) + 5.48);
            ppefr = WrightToEU[  (int) Math. round(ppefr) - 1];
            oppefr = ppefr;
            p5 = (ppefr - 2.896);
            ppefr = Math.round(ppefr);
        } else if (paramsDTO.getSex().equals(SexEnum.FEMALE)) {
            pfev1 = 1.597 + (0.5552 * h * h * h) - 0.01574 * a * h;
            opfev1 = pfev1;
            f5 = pfev1 - 0.560;
            pfev1 = pfev1 * 100;
            pfev1 = Math.round(pfev1);
            pfev1 = (double) (pfev1);
            pfev1 = pfev1 / 100;
            pratio = -4068.039 + (0.7137 * a) + (0.002234 * a * a) + (7675.039 * h) - (4719.018 * h * h) + (967.776 * h * h * h) - (0.6946 * a * h);
            r5 = pratio - 8.016;
            pfvc = -3.598 - (0.0002525 * a * a) + (4.680 * h);
            opfvc = pfvc;
            v5 = pfvc - 0.629;
            pfvc = pfvc * 100;
            pfvc = Math.round(pfvc);
            pfvc = pfvc / 100;
            ppefr = eTo((0.376 * ln(a)) - (0.012 * a) - (58.8 / height) + 5.63);
            ppefr = WrightToEU[ (int)  Math.round(ppefr) - 1];
            oppefr = ppefr;
            p5 = (ppefr - 2.230);
            ppefr = Math.round(ppefr);
            
        }
        if (fev1 > f5) {
            cfev1 = (fev1 / opfev1) * 100;
       } else {
            cfev1 = (fev1 / opfev1) * 100;
       }
       if (fvc > v5) {
            cfvc = (fvc / opfvc) * 100;
       } else {
            cfvc = (fvc / opfvc) * 100;
       }
       if (ratio > r5) {
            cratio = "(Normal)";
       } else {
            cratio = "(Low - consider COPD)";
       }
       
       if (pefr > p5) {
            cpefr = (pefr / oppefr) * 100;
       } else {
            cpefr = (pefr / oppefr) * 100;
       }
       
       System.out.println(paramsDTO);
       OutputDTO outputDTO=OutputDTO.builder().ppefr(ppefr).ratio(ratio).pratio(pratio).cratio(cratio).cfev1(cfev1).cfvc(cfvc).cpefr(cpefr).build();    
       System.out.println(outputDTO);
       return outputDTO;
    	
    }
}
