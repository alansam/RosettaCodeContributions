
#include <iostream>
#include <string>

//--------------------------------------------------------------------------------------------------
using namespace std;

//--------------------------------------------------------------------------------------------------
class playfair
{
public:
  void doIt( string k, string t, bool ij, bool e )
  {
    createGrid( k, ij );
    getTextReady( t, ij, e );
    if ( e )
    {
      doIt( 1 );
    }
    else
    {
      doIt( -1 );
    }
    display();
  }

private:
  void doIt( int dir )
  {
    int a, b, c, d; string ntxt;
    for ( string::const_iterator ti = _txt.begin(); ti != _txt.end(); ti++ )
    {
	    if ( getCharPos( *ti++, a, b ) )
	    {
        if ( getCharPos( *ti, c, d ) )
        {
          if ( a == c )
          {
            ntxt += getChar( a, b + dir );
            ntxt += getChar( c, d + dir );
          }
          else if ( b == d )
          {
            ntxt += getChar( a + dir, b );
            ntxt += getChar( c + dir, d );
          }
          else
          {
            ntxt += getChar( c, b );
            ntxt += getChar( a, d );
          }
        }
      }
    }
		_txt = ntxt;
  }

  void display()
  {
    cout << "\n\n OUTPUT:\n=========" << endl;
    string::iterator si = _txt.begin();
    int cnt = 0;
    while ( si != _txt.end() )
    {
      cout << ( *si );
      si++;
      cout << ( *si ) << " ";
      si++;
      if ( ++cnt >= 26 )
      {
        cout << endl, cnt = 0;
      }
    }
    cout << endl << endl;
  }

  char * getChar( int a, int b )
  {
    if ( a > 4 ) a = 0;
    if ( b > 4 ) b = 0;
    if ( a < 0 ) a = 4;
    if ( b < 0 ) b = 4;
    return &_m[a + 5 * b];
  }

  bool getCharPos( char l, int &a, int &b )
  {
    for ( int y = 0; y < 5; y++ )
    {
      int yy = 5 * y;
      for ( int x = 0; x < 5; x++ )
      {
        if ( _m[x + yy] == l )
        {
          a = x; b = y; return true;
        }
      }
    }
    return false;
  }

  void getTextReady( string t, bool ij, bool e )
  {
    for ( string::iterator si = t.begin(); si != t.end(); si++ )
    {
      ( *si ) = toupper( ( *si ) );
      if ( ( *si ) < 65 || ( *si ) > 90 )
      {
        continue;
      }
      if ( ( *si ) == 'J' && ij )
      {
        ( *si ) = 'I';
      }
      else if ( ( *si ) == 'Q' && !ij )
      {
        continue;
      }
      _txt.append( &( *si ), 1 );
    }
    if ( e )
    {
      string ntxt = ""; size_t len = _txt.length();
      for ( size_t x = 0; x < len; x += 2 )
      {
        ntxt.append( &_txt[x], 1 );
        if ( x + 1 < len )
        {
          if ( _txt[x] == _txt[x + 1] )
          {
            ntxt.append( "X" );
          }
          ntxt.append( &_txt[x + 1], 1 );
        }
      }
      _txt = ntxt;
    }
    if ( _txt.length() & 1 )
    {
      _txt.append( "X", 1 );
    }
  }

  void createGrid( string k, bool ij )
  {
    if ( k.length() < 1 )
    {
      k = "KEYWORD";
    }
    k.append( "ABCDEFGHIJKLMNOPQRSTUVWXYZ" );
    string nk = "";
    for ( string::iterator si = k.begin(); si != k.end(); si++ )
    {
      ( *si ) = toupper( ( *si ) );
      if ( ( *si ) < 65 || ( *si ) > 90 )
      {
        continue;
      }
      if ( ( ( *si ) == 'J' && ij ) || ( ( *si ) == 'Q' && !ij ) )
      {
        continue;
      }
      if ( nk.find( ( *si ) ) == -1 )
      {
        nk.append( &( *si ), 1 );
      }
    }
    copy( nk.begin(), nk.end(), _m );
  }

  string _txt;
  char _m[25];
};

//--------------------------------------------------------------------------------------------------
int main( int argc, char* argv[] )
{
  string key, i, txt;
  bool ij, e;
  cout << "(E)ncode or (D)ecode? ";
  getline( cin, i );
  e = ( i[0] == 'e' || i[0] == 'E' );
  cout << "Enter a en/decryption key: ";
  getline( cin, key );
  cout << "I <-> J (Y/N): ";
  getline( cin, i );
  ij = ( i[0] == 'y' || i[0] == 'Y' );
  cout << "Enter the text: ";
  getline( cin, txt );
  playfair pf;
  pf.doIt( key, txt, ij, e );
  return system( "pause" );
}
//--------------------------------------------------------------------------------------------------

